// validating/StringInverter.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package validating;
//功能是反转 String 中字符的大小写。
// 约束：String 必须小于或等于30个字符，并且必须只包含字母，空格，逗号和句号(英文)。
interface StringInverter {
    String invert(String str);
}
