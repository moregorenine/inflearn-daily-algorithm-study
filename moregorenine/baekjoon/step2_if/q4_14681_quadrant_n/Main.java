package baekjoon.step2_if.q4_14681_quadrant_n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int positionX = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int positionY = Integer.parseInt(st.nextToken());

        printQuadrant(positionX, positionY);
    }

    private static void printQuadrant(int positionX, int positionY) {
        if (positionX > 0 && positionY > 0) {
            System.out.println("1");
        } else if (positionX < 0 && positionY > 0) {
            System.out.println("2");
        } else if (positionX < 0 && positionY < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }

}
