package Test;
import java.util.*;
public class Test_argswords {
	public static void main(String[] args){
		Map<String,Integer> A = new HashMap<String,Integer>();
		for(int i=0; i<args.length; i++){
			Integer p = (Integer)A.get(args[i]);//��ȡ����� args��i�����洢��Ԫ��
			A.put(args[i],p==null?1:(Integer)A.get(args[i])+1);
		}
	}
}
