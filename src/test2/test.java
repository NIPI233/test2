package test2;

public class test {
	public static void main(String[] args) {

		String str = "qw";
		if(str=="") {
			System.out.println(str);
		}
		else {
		System.out.println("111");
		}
	}

	
	/**
	 * ������ת����Ϊ�ַ���
	 * @param arr    �ַ�������
	 * @param symbol ���ӷ���
	 * @return �ַ���
	 */
	public static String arrToStr(String[] arr, String symbol, String symbol1)
	{
	    // ʵ����StringBuffer
	    StringBuffer sb = new StringBuffer();
	    // �ж�arr�Ƿ�Ϊ��Ч����
	    if (arr != null && arr.length > 0)
	    {
	        // ��������
//	        for (String s : arr)
//	        {
	          for(int i=0;i<arr.length;i++) {
	        	if((i+1)%3!=0) { 	
	            // ���ַ���׷�ӵ�StringBuffer��
	            sb.append(arr[i]);
	            // ���ַ���׷�ӵ�StringBuffer��
	            sb.append(symbol);
	        	}
	        	else {
	        		sb.append(arr[i]);
	        	    sb.append(symbol1);
	        	}         
	          }
//	        }
	        // �ж��ַ��������Ƿ���Ч
	        if (sb.length() > 0)
	        {
	            // ��ȡ�ַ�
	            sb = sb.deleteCharAt(sb.length() - 1);
	        }
	    }
	    // �����ַ���
	    return sb.toString();
	}
	
}
