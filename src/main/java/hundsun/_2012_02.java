package hundsun;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author xuyuhan
 * @date 2019-10-25 15:23
 */

public class _2012_02 {

        public static void main(String[] args) {

            ThreadLocal<ArrayList<Integer>> local = new ThreadLocal<>();
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(3);
            integers.add(4);
            local.set(integers);
            Calendar c = Calendar.getInstance();

            c.set(Calendar.DAY_OF_YEAR, 118);

            Format f = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println(f.format(c.getTime()));
            System.out.println(local.get().iterator());
        }
    }

