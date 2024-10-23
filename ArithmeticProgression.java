

public class ArithmeticProgression 
{
	private final int firstTerm;
	private final int step;

	public ArithmeticProgression(int firstTerm, int step) {
		super();
		this.firstTerm = firstTerm;
		this.step = step;
	}

	public int termOfIndex(int index) {
		return firstTerm + (index - 1) * step;
	}

	public int[] generatedSequence(int numberOfTerms) {
		int[] sequence = new int[numberOfTerms];
		for (int i = 0; i < numberOfTerms; i++) {
			sequence[i] = termOfIndex(i);
		}
		return sequence;
	}

	public int firstTerm() {
		return firstTerm;
	}
	
	public int step() {
		return step;
	}
}
