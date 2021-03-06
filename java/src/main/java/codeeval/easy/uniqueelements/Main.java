package codeeval.easy.uniqueelements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Main {
    public static void main(String[] args) throws Exception {
        final File inputFile = new File(args[0]);
        final InputStream fileStream = new FileInputStream(inputFile);
        final Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        final BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            final String[] strings = line.trim().split(",");
            final Set<String> set = new LinkedHashSet<>();
            Collections.addAll(set, strings);
            final Object[] objects = set.toArray();
            final StringBuilder temp = new StringBuilder();
            for (Object string : objects) {
                temp.append(string).append(",");
            }

            System.out.println(
                (temp.lastIndexOf(",") != -1) ? temp.substring(0, temp.lastIndexOf(",")) : temp.toString());
        }
    }
}
