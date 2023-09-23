package lk.ijse.gdse.assignment02.util;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
 * Author  : Thamindu Ranawaka
 * Date    : 9/21/2023
 * Project : Assignment-2-Gradle
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUtil {

    int code;
    String message;
    Object data;
}
