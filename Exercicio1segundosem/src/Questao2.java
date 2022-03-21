import java.util.*;
public class Questao2 {

public static void main(String[] args) {
		
		Random gen = new Random();
		int[][] x = new int[4][4];
		int aux = 0, aux2;
		int[] auxx = new int[6];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				x[i][j] = gen.nextInt(10);
				System.out.print(x[i][j]+"\t");
				if(i > j) {
					auxx[aux] = x[i][j];
					aux++;	}	}
			System.out.println();	}
		
		aux2 = auxx[2];
		auxx[2] = auxx[3];
		auxx[3] = aux2;
		
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i < j) {
					x[j][i] = x[i][j];	}}}
		
		System.out.println();
		
		aux = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(j > i ) {
					x[i][j] = auxx[aux];
					aux++;}
				System.out.print(x[i][j]+"\t");}
			System.out.println();	}}}
