package com.ohgiraffers.section02.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class G_TreeTraversal {

    // 각 노드(알파벳 A-Z)의 왼쪽, 오른쪽 자식을 저장하는 배열(-1이면 자식없음)
    static int[] left;
    static int[] right;
    static StringBuilder sb;

    public static String solution(String input) throws IOException {
        BufferedReader br=new BufferedReader(new StringReader(input));
        int n = Integer.parseInt(br.readLine());

        left=new int[26];
        right=new int[26];
        Arrays.fill(left,-1);
        Arrays.fill(right,-1);

        return sb.toString();
    }
}
