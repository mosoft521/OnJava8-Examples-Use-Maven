// objects/ShowProperties.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class ShowProperties {
  public static void main(String[] args) {
    System.getProperties().list(System.out);
    System.out.println(System.getProperty("user.name"));
    System.out.println(
      System.getProperty("java.library.path"));
  }
}
/* Output: (First 20 Lines)
-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=D:\tools\Java\jdk1.8.0_281\jre\bin
java.vm.version=25.281-b09
java.vm.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
path.separator=;
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg=sun.io
user.script=
user.country=CN
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=
java.vm.specification.name=Java Virtual Machine Specification
user.dir=E:\ws_ij_alvin\OnJava8-Examples-Use-M...
java.runtime.version=1.8.0_281-b09
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs=D:\tools\Java\jdk1.8.0_281\jre\lib\en...
os.arch=amd64
java.io.tmpdir=C:\Users\Alvin\AppData\Local\Temp\
line.separator=

java.vm.specification.vendor=Oracle Corporation
user.variant=
os.name=Windows 10
sun.jnu.encoding=GBK
java.library.path=D:\tools\Java\jdk1.8.0_281\bin;C:\Win...
java.specification.name=Java Platform API Specification
java.class.version=52.0
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
os.version=10.0
user.home=C:\Users\Alvin
user.timezone=
java.awt.printerjob=sun.awt.windows.WPrinterJob
file.encoding=UTF-8
java.specification.version=1.8
user.name=Alvin
java.class.path=D:\tools\Java\jdk1.8.0_281\jre\lib\ch...
java.vm.specification.version=1.8
sun.arch.data.model=64
java.home=D:\tools\Java\jdk1.8.0_281\jre
sun.java.command=ShowProperties
java.specification.vendor=Oracle Corporation
user.language=zh
awt.toolkit=sun.awt.windows.WToolkit
java.vm.info=mixed mode
java.version=1.8.0_281
java.ext.dirs=D:\tools\Java\jdk1.8.0_281\jre\lib\ex...
sun.boot.class.path=D:\tools\Java\jdk1.8.0_281\jre\lib\re...
java.vendor=Oracle Corporation
file.separator=\
java.vendor.url.bug=http://bugreport.sun.com/bugreport/
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
sun.desktop=windows
sun.cpu.isalist=amd64
Alvin
D:\tools\Java\jdk1.8.0_281\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;D:\tools\Python\Python39\Scripts\;D:\tools\Python\Python39\;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;D:\tools\Python39\Scripts\;D:\tools\Python39\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\ATI Technologies\ATI.ACE\Core-Static;D:\tools\Python\Python39\;D:\tools\Java\jdk1.8.0_281\bin;D:\tools\maven\apache-maven-3.6.3\bin;D:\tools\gradle\gradle-4.10.3\bin;D:\tools\Git\cmd;D:\tools\Go\bin;"D:\tools\tomcat\apache-tomcat-10.0.2\lib;D:\tools\tomcat\apache-tomcat-10.0.2\bin";C:\Users\Alvin\AppData\Local\Microsoft\WindowsApps;;D:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin;;D:\Program Files\JetBrains\PyCharm 2020.3.3\bin;;C:\Users\Alvin\go\bin;.
*/
