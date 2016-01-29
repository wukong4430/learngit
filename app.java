

/**
 * 该类用于搜索与输入相匹配的内容
 * @author Anjail
 *
 */
public class searchResult
{
	private ProfessorInfo pi;
	public double tf;
	
	public searchResult(ProfessorInfo pi)
	{
		this.pi = pi;
		//this.tf =  tf;
	}
	public ProfessorInfo getPi()
	{
		return pi;
	}
	
	public double getTF()
	{
		return tf;
	}
	
}