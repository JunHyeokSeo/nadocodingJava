package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        // 폴더 생성 확인
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("----------------------------------");

        folderName = "A/B/C";
        // "A" + File.separator + "B" + File.separator + "C"

        // 윈도우 : C:\\Users\\Nadocoding\\Desktop
        // 맥 : /Users/Nadocoding/Desktop

        folder = new File(folderName);
        // mkdir() : 상위 폴더가 있는 상태에서, 내가 만들고자 하는 폴더 '하나'만 생성 가능
        folder.mkdirs(); // 여러개의 하위 폴더로 구성되는 경우
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
