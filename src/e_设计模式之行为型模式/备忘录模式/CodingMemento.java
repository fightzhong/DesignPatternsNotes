package e_设计模式之行为型模式.备忘录模式;

public class CodingMemento {
	private String projectState; // 项目进度
	private long codeLineSize;   // 代码行数

	public CodingMemento (String projectState, long codeLineSize) {
		this.projectState = projectState;
		this.codeLineSize = codeLineSize;
	}

	public String getProjectState () {
		return projectState;
	}

	public long getCodeLineSize () {
		return codeLineSize;
	}
}
