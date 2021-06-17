package zs.qeb.ty.POJOclasses;
/**
 * TLE Test Limit exceeded response written as POJO class  
 * @author rohit
 *
 */
public class TLEPojo
{
    private CodeCompileOutput codeCompileOutput;

    private CodeRunOutputList[] codeRunOutputList;

    private String status;

    public CodeCompileOutput getCodeCompileOutput ()
    {
        return codeCompileOutput;
    }

    public void setCodeCompileOutput (CodeCompileOutput codeCompileOutput)
    {
        this.codeCompileOutput = codeCompileOutput;
    }

    public CodeRunOutputList[] getCodeRunOutputList ()
    {
        return codeRunOutputList;
    }

    public void setCodeRunOutputList (CodeRunOutputList[] codeRunOutputList)
    {
        this.codeRunOutputList = codeRunOutputList;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [codeCompileOutput = "+codeCompileOutput+", codeRunOutputList = "+codeRunOutputList+", status = "+status+"]";
    }
}