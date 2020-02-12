//import java.util.ArrayList;
//import java.util.List;
//
//public class Hr {
//	public static List<Integer> gradingStudents(List<Integer> grades) {
//			ArrayList<Integer> fn = new ArrayList<>();
//	        int score=0;
//	        for (int i = 0; i<grades.size();i++){
//	        	if (grades.get(i) < 38){
//	                 score = grades.get(i);
//	                }else{
//	                    int temp=grades.get(i)/5;
//	                    temp++;
//	                    int g=temp*5;
//	                    if(g-grades.get(i)<3){
//	                         score = g;
//	                    }else{
//	                    score=grades.get(i);
//	                    }
//	                }
//	         fn.add(score);
//	        }
//	        return fn;
//	}
//
//	//
//	  public static String kangaroo(int x1, int v1, int x2, int v2) {
//	      	String result="";
//	        int idx=0;
//	        if(v2>v1){
//	            result="NO";
//	        }else{
//	            while(x2 > x1 && idx<=10000){
//	                idx++;
//	                if(x1+v1*idx == x2+v2*idx){
//	                   result= "YES";
//	                   break;
//	                }
//	                result="NO";
//	            }
//	        }
//	        return result;
//	    }
//
//	/*
//	1번 캥거루와 2번 캥거루가 있다. 각각 출발점은 x1과 x2이며, x축 양의 방향으로 한번씩 뛴다. 뛸 때마다 각각 v1,v2 만큼 뛴다.
//	캥거루가 동시에 뛰는데, 이 경우 언젠가 두 캥거루가 같은 지점에 착지하면 YES를 반환, 그런 경우가 없으면 NO를 반환
//	1.0<=x1<x2<=10000
//	  1<=v1<=10000
//	  1<=v2<=10000
//	2.두 번째 캥거루의 시작 위치는 첫 번째 캥거루의 시작 위치보다 앞에 있다.(x1<x2) 
//	  따라서 두번째 캥거루가 더 빠른 속도로 이동하면(v1<v2) 이미 앞서 있기 때문에 첫 번째 캥거루는 절대 따라 잡을 수 없으므로 "NO" 출력
//	*/
//	 public static String kangaroo(int x1, int v1, int x2, int v2) {
//              if(v2>v1 || v2==v1){
//                 return "NO";
//              }else{
//                return kangarooMeet(x1,v1,x2,v2);
//              }
//           
//          }
//    
//       public static String kangarooMeet(int x1,int v1,int x2, int v2){
//              int idx=0;
//              while(x2>x1&&idx<=10000){
//                  idx++;
//                  if(x1+v1*idx == x2+v2*idx){
//                     return "YES";
//                     
//                  }else if(x1+v1*idx>x2+v2*idx){
//                      break;
//                  }
//             }
//             return "NO";
//       }  
//>>>>>>> refs/remotes/origin/master
//}
//
//	  
//	
//
//
