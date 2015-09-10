package ch1.sec3;

import java.util.Scanner;

/**
 * Created by kiss on 15/9/9.
 */
public class MaxSubseqSum {
    private int[] sequence;
    private int seqLength;

    public int calMaxSubseqSum2() {
        this.getInputs();
        int thisSum, maxSum = 0;
        for (int i = 0; i < sequence.length; i++) {
            thisSum = 0;
            for (int j = 0; j < sequence.length; j++) {
                thisSum += sequence[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    private void getInputs() {
        Scanner scanner = new Scanner(System.in);
        this.setSeqLength(scanner.nextInt());

        int[] inSeq = new int[this.getSeqLength()];
        for (int i = 0; i < this.getSeqLength(); i++) {
            inSeq[i] = scanner.nextInt();
        }
        this.setSequence(inSeq);
    }

    public static void main(String[] args) {
        MaxSubseqSum obj = new MaxSubseqSum();
        System.out.println(obj.calMaxSubseqSum2());
    }

    public int[] getSequence() {
        return sequence;
    }

    public void setSequence(int[] sequence) {
        this.sequence = sequence;
    }

    public int getSeqLength() {
        return seqLength;
    }

    public void setSeqLength(int seqLength) {
        this.seqLength = seqLength;
    }
}
