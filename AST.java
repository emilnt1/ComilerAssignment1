
class faux{
    public static void error(String msg){
        System.err.println("Interpreter error: " + msg);
        System.exit(-1);
    }
}

enum Type{
    DOUBLETYPE, BOOLTYPE
}

class Value{
    public Type valuetype;
    public double d;
    public boolean b;
    Value(double d){valuetype=Type.DOUBLETYPE; this.d=d;}
    Value(boolean b){valuetype=Type.BOOLTYPE; this.b=b;}

    public String toString(){
        if (valuetype == Type.DOUBLETYPE){
            return ""+d;
        }
        return ""+b;
    }

}



public abstract class AST{

}

abstract class Expr extends AST{
    abstract public Value eval(Environment env);

    abstract public Type typecheck(Environment env);
}

class Addition extends Expr{
    Expr e1,e2;
    Addition(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
//    public Double eval(Environment env){
//        return e1.eval(env)+e2.eval(env);
//    }
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        return new Value(v1.d+v2.d);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        faux.error("Addition of non-doubles");
        return null;
    }
}

class Subtraction extends Expr{
    Expr e1,e2;
    Subtraction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        return new Value(v1.d-v2.d);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        faux.error("Subtraction of non-doubles");
        return null;
    }
}

class Multiplication extends Expr{
    Expr e1,e2;
    Multiplication(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        return new Value(v1.d*v2.d);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        faux.error("Multiplication of non-doubles");
        return null;
    }
}

class Division extends Expr{
    Expr e1,e2;
    Division(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        return new Value(v1.d/v2.d);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        faux.error("Division of non-doubles");
        return null;
    }
}

class Arrayy extends Expr{
    String arrname;
    Expr e;
    Arrayy(String v, Expr e){
        this.arrname=v; this.e=e;
    }
    public Value eval(Environment env){
        Value d=e.eval(env);
        arrname = arrname+"["+d+"]";
        return env.getVariable(arrname);

    }

    public Type typecheck(Environment env){
        return env.getVariable(arrname).valuetype;
    }
}

class Constant extends Expr{
    public Value v;
    Constant(Value v){this.v=v;}
    public Value eval(Environment env){
	return v;
    }

    public Type typecheck(Environment env){return v.valuetype;}
}

class Negative extends Expr{
    public Value v;
    Negative(Value v){this.v=v;}
    public Value eval(Environment env){
        return new Value(-v.d);
    }

    public Type typecheck(Environment env){return v.valuetype;}
}

class Variable extends Expr{
    public String varname;
    Variable(String varname){this.varname=varname;}
    public Value eval(Environment env){

        return env.getVariable(varname);
    }

    public Type typecheck(Environment env){
        return env.getVariable(varname).valuetype;
    }
}

abstract class Command extends AST{
    abstract public void eval(Environment env);
}

// Do nothing command 
class NOP extends Command{
    public void eval(Environment env){}

}

class Sequence extends Command{
    Command c1,c2;
    Sequence(Command c1, Command c2){this.c1=c1; this.c2=c2;}
    public void eval(Environment env){
	c1.eval(env);
	c2.eval(env);
    }
}


class Assignment extends Command{
    String v;
    Expr e;
    Assignment(String v, Expr e){
	this.v=v; this.e=e;
    }
    public void eval(Environment env){
	Value d=e.eval(env);
	env.setVariable(v,d);
    }
}

class Output extends Command{
    Expr e;
    Output(Expr e){
	this.e=e;

    }
    public void eval(Environment env){
			Value d=e.eval(env);
			System.out.println(d);

    }
}

class While extends Command{
    Condition c;
    Command body;
    While(Condition c, Command body){
	this.c=c; this.body=body;
    }
    public void eval(Environment env){
	while (c.eval(env).b)
	    body.eval(env);
    }
}

class If extends Command{
    Condition c;
    Command body;
    If(Condition c, Command body){
    this.c=c; this.body=body;
    }
    public void eval(Environment env){
    if (c.eval(env).b)
        body.eval(env);
    }
}

class For extends Command{
    String v;
    Expr e1;
    Expr e2;
    Command body;
    For(String v, Expr e1, Expr e2,Command body){
        this.v=v; this.e1=e1; this.e2=e2; this.body=body;
    }
    public void eval(Environment env){
        Value i=e1.eval(env);
        env.setVariable(v,i);
        Value n=e2.eval(env);

        for (; i.d < n.d; i.d++) {
            body.eval(env);
        }
    }
}

class ArrayAssignment extends Command{
    String v;
    Expr e1;
    Expr e2;
    ArrayAssignment(String v, Expr e1, Expr e2){
        this.v=v; this.e1=e1; this.e2=e2;
    }
    public void eval(Environment env){
        Value d=e1.eval(env);
        v = v+"["+d.d+"]";

        Value i=e2.eval(env);
        env.setVariable(v,i);
    }
}


abstract class Condition extends AST{
    abstract public Value eval(Environment env);

    abstract public Type typecheck(Environment env);
}

class Unequal extends Condition{
    Expr e1,e2;
    Unequal(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
//    public Boolean eval(Environment env){
//	return ! e1.eval(env).equals(e2.eval(env));
//    }
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        if (v1.valuetype==Type.DOUBLETYPE){
            return new Value(v1.d!=v2.d);
        }
        return new Value(v1.b!=v2.b);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        if (t1==Type.BOOLTYPE && t2==Type.BOOLTYPE){
            return Type.BOOLTYPE;
        }
        faux.error("Comparison of int with bools");
        return null;
    }
}

class Equal extends Condition{
    Expr e1,e2;
    Equal(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
//    public Boolean eval(Environment env){
//	return e1.eval(env).equals(e2.eval(env));
//    }
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);
        if (v1.valuetype==Type.DOUBLETYPE){
            return new Value(v1.d==v2.d);
        }
        return new Value(v1.b==v2.b);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        if (t1==Type.BOOLTYPE && t2==Type.BOOLTYPE){
            return Type.BOOLTYPE;
        }
        faux.error("Comparison of int with bools");
        return null;
    }
 
}

class Not extends Condition {
    Condition c;

    Not(Condition c) {
        this.c = c;
    }

    //    public Boolean eval(Environment env){
//        return !c.eval(env);
//    }
    public Value eval(Environment env) {
        Value v1 = c.eval(env);

        return new Value(!v1.b);

    }


    public Type typecheck(Environment env){
        Type t1=c.typecheck(env);

        if (t1==Type.BOOLTYPE){
            return Type.BOOLTYPE;
        }
        faux.error("Cant not a double!");
        return null;
    }

}

class And extends Condition{
    Condition c1,c2;
    And(Condition c1, Condition c2){this.c1=c1; this.c2=c2;}
//    public Boolean eval(Environment env){
//        System.out.println(c1.eval(env) && c2.eval(env));
//        return c1.eval(env) && c2.eval(env);
//    }
    public Value eval(Environment env){
        Value v1=c1.eval(env);
        Value v2=c2.eval(env);

        return new Value(v1.b && v2.b);
    }

    public Type typecheck(Environment env){
        Type t1=c1.typecheck(env);
        Type t2=c2.typecheck(env);

        if (t1==Type.BOOLTYPE && t2==Type.BOOLTYPE){
            return Type.BOOLTYPE;
        }
        faux.error("Anding two doubles");
        return null;
    }
 
}

class Or extends Condition{
    Condition c1,c2;
    Or(Condition c1, Condition c2){this.c1=c1; this.c2=c2;}
//    public Boolean eval(Environment env){
//        System.out.println(c1.eval(env) || c2.eval(env));
//        return c1.eval(env) || c2.eval(env);
//    }

    public Value eval(Environment env){
        Value v1=c1.eval(env);
        Value v2=c2.eval(env);

        return new Value(v1.b || v2.b);
    }

    public Type typecheck(Environment env){
        Type t1=c1.typecheck(env);
        Type t2=c2.typecheck(env);

        if (t1==Type.BOOLTYPE && t2==Type.BOOLTYPE){
            return Type.BOOLTYPE;
        }
        faux.error("Cant 'or' two doubles!");
        return null;
    }
}

class Smaller extends Condition{
    Expr e1,e2;
    Smaller(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
//    public Boolean eval(Environment env){
//	return e1.eval(env) < e2.eval(env);
//    }
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);

        return new Value(v1.d < v2.d);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        faux.error("Cant compare two booleans with '<'");
        return null;
    }
}

class Larger extends Condition{
    Expr e1,e2;
    Larger(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
//    public Boolean eval(Environment env){
//	return e1.eval(env) > e2.eval(env);
//    }
    public Value eval(Environment env){
        Value v1=e1.eval(env);
        Value v2=e2.eval(env);

        return new Value(v1.d > v2.d);
    }

    public Type typecheck(Environment env){
        Type t1=e1.typecheck(env);
        Type t2=e2.typecheck(env);

        if (t1==Type.DOUBLETYPE && t2==Type.DOUBLETYPE){
            return Type.DOUBLETYPE;
        }
        faux.error("Cant compare two booleans with '>'");
        return null;
    }
}
