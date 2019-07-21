package e_设计模式之行为型模式.备忘录模式;

public class Coding {
	private String projectState; // 项目进度
	private long codeLineSize;   // 代码行数

	/**
	 * 添加代码存档
	 * @return
	 */
	public CodingMemento savingCodingState () {
		return new CodingMemento( projectState, codeLineSize );
	}

	/**
	 * 重置代码到codingMemento状态
	 * @param codingMemento
	 */
	public void resetCodingState (CodingMemento codingMemento) {
		this.projectState = codingMemento.getProjectState();
		this.codeLineSize = codingMemento.getCodeLineSize();
	}

	public String getProjectState () {
		return projectState;
	}

	public void setProjectState (String projectState) {
		this.projectState = projectState;
	}

	public long getCodeLineSize () {
		return codeLineSize;
	}

	public void setCodeLineSize (long codeLineSize) {
		this.codeLineSize = codeLineSize;
	}

	@Override
	public String toString () {
		return "当前项目进度: " + projectState + ", 代码行数为: " + codeLineSize;
	}
}
