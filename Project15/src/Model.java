import java.util.Observable;
public class Model extends Observable
{
    public static final int none = 0;
    public static final int plus  = 1;
    public static final int minus  = 2;
    public static final int multy  = 3;
    public static final int divis  = 4;
    private int pendingOp = 0;
    private int pValue = 0;
    private int cValue = 0;
    public String getValue()
    {
        return Integer.toString(cValue);
    }
    public void addDigit(String s)
    {
        char c = s.charAt(0);
        String val = getValue() + c;
        setDisplay(Integer.parseInt(val));
    }
    public void addDigit(char c)
    {
        String val = getValue() + c;
        setDisplay(Integer.parseInt(val));
    }
    public void setOperation(int op)
    {
        if (pendingOp != none)
            calculate();
        pValue = cValue;
        this.pendingOp = op;
        cValue = 0;
    }
    public void setDisplay(int value)
    {
        cValue = value;
        setChanged();
        notifyObservers();
    }
    public void clear()
    {
        this.pendingOp = none;
        pValue = 0;
        setDisplay(0);
    }
    public void calculate()
    {
        switch (pendingOp)
        {
            case plus:
                setDisplay(pValue + cValue);
                break;
            case minus:
                setDisplay(pValue - cValue);
                break;
            case multy:
                setDisplay(pValue * cValue);
                break;
            case divis:
                setDisplay(pValue / cValue);
                break;
        }
        pendingOp = none;
        pValue = 0;
    }
} 