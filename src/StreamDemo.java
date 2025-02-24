import ra.NoValueExxception;
import ra.Student;

import java.util.*;
import java.util.function.Predicate;

public class StreamDemo {
    public static void main(String[] args) {
        // filter
        // bài toán : lọc các tên sinh viên có chứa chuỗi mà người dùng nhập va
        List<String> nameList = Arrays.asList(
                "Nguyen Van A", "Do ngoc B","Trieu Xuan C","Tran Minh E","Pham Van F"
        );

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hay nhap chuoi can tim :");
//        String searchName = sc.nextLine();
//        for (String name : nameList) {
//            if(name.contains(searchName)){
//                System.out.println(name);
//            }
//        }
//        nameList.stream()
//                .filter(s -> s.contains(searchName))
//                .forEach(s -> System.out.println(s));

        // Map : chuyển đổi phan tử
        // chuyen doi từ danh sach các ten -> danh sách ca dôi tuong Student vói tên tương ung
//        List<Student> studentList= new ArrayList<>();
//        for(String name : nameList){
//            Student student = new Student(name);
//            studentList.add(student);
//        }
        List<Student> studentList =  nameList.stream()
                .map(s -> new Student(s))
                .toList();

        // Min max
        List<Integer> list = Arrays.asList(1,3,5,7,9,-1,2,3,4,5,6);
        // tìm min max của danh sách
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
//       if (min.isPresent()){
//           System.out.println(min.get());
//       }

//        Integer value = min.orElse(null);
        Integer value = min.orElseThrow(() -> new NoValueExxception("ko ton tai gia tri min"));
        System.out.println(value);
    }
}
