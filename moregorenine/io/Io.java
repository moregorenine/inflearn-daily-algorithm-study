package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class Io {
    private static Logger logger = java.util.logging.Logger.getLogger(Io.class.getName());

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            logger.info(st.nextToken());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        int loop = 10;
        try {
            for (int i = 0; i < loop; i++) {
//                st = new StringTokenizer(br.readLine());
                bw.write(br.readLine() + "\n");
            }
            bw.flush();
        } finally {
            bw.close();
        }

    }
}
