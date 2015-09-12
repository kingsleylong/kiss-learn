package ch1.exer.复杂度1;

import java.util.Scanner;

/**
 * Created by kiss on 15/9/11.
 *
 * 01-复杂度1 最大子列和问题
 *
 * http://pta.patest.cn/pta/test/18/exam/4/question/610
 */
public class Main {
    private int[] sequence;
    private int seqLength;

    public int calMaxSubseqSum2() {
        this.getInputs();
        int thisSum, maxSum = 0;
        for (int i = 0; i < sequence.length; i++) {
            thisSum = 0;
            for (int j = i; j < sequence.length; j++) {
                thisSum += sequence[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public int calMaxSubseqSum3() {
        this.getInputs();
        int thisSum = 0, maxSum = 0;
        for (int i = 0; i < sequence.length; i++) {
            thisSum += sequence[i];
            if (thisSum > maxSum) {
                maxSum = thisSum;
            }
            if (thisSum < 0) {
                thisSum = 0;
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
        Main obj = new Main();
//        System.out.println(obj.calMaxSubseqSum2());
        System.out.println(obj.calMaxSubseqSum3());
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
