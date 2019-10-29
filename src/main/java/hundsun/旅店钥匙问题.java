package hundsun;

/**
 * @author xuyuhan
 * @date 2019-10-29 20:14
 */

public class 旅店钥匙问题 {
//    f(n)=(n-1)(f(n-1)+f(n-2));其中f(1)=0;f(2)=1;--推导出公式


    int f(int n) {

        if(0 == n){

            return 0;

        }

        if(1 == n){

            return 0;

        }

        if(2 == n){

            return 1;

        }

        return f(n-1)+f(n-2);

    }

//    int main(int argc, char* argv[]) {

        int n = 10;

//        printf("%d %s%d\n", n, “个人的情况下出错的种类一共有：”,(n-1)f(n));

    }

//}
