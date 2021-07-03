package homework.v3;


import homework.v3.da.externalize.ExternalizeReaderHomework;
import homework.v3.da.externalize.ExternalizeWriterHomework;
import homework.v3.da.externalize.JsonReaderExternalizeHomework;
import homework.v3.da.externalize.JsonWriterExternalizeHomework;
import homework.v3.da.serialize.JsonReaderHomework;
import homework.v3.da.serialize.JsonWriterHomework;
import homework.v3.da.serialize.SerializeReaderHomework;
import homework.v3.da.serialize.SerializeWriterHomework;
import homework.v3.entity.JsonFileClass;
import homework.v3.externalize.JsonFileClassExternalize;

import java.io.IOException;

/**
 * Задание
 * 1) Составить файл с JSON-объектом, который "разложен" в пакете homework.v3.classwork.entity.
 * Определить какой элемент является корневым
 * Дать имя файлу homework.parameters.json
 * Сделать файл с минимум пятью элементами
 * 2) Заполнить его значениями (как пример "parameters.v1.json")
 * 3) Считать получившийся homework.parameters.json в память
 * 4) Сериализовать его с помощью встроенного механиза сериализации в файл с именем homework.parameters.ser
 * 5) Сериализовать его с использованием интерфейса Externalizable в файл с именем homework.parameters.exter
 * 6) Считать данные из файла homework.parameters.ser в память и сохранить в формате JSON в файл с именем homework.result.ser.parameters.json
 * 7) Считать данные из файла homework.parameters.exter в память и сохранить в формате JSON в файл с именем homework.result.exter.parameters.json
 * 8) Убедиться, что файлы homework.result.ser.parameters.json и  homework.result.exter.parameters.json
 * совпадают с homework.parameters.json
 * 9) Составленную в п.1 сущность представить в виде xsd-схемы и
 * выполнить генерацию классов аналогично классам из пакета classwork.entity.jaxb
 * * можно сделать и с json-схемой, пренципиально механизм не поменяется.
 * */

public class HomeWork {
    public static final String SOURCE_FILE = "homework.parameters.json";
    public static final String RESULT_FILE_SER = "homework.parameters.ser";
    public static final String RESULT_FILE_EXTER = "homework.parameters.exter";
    public static final String RESULT_FILE_SER_JSON = "homework.result.ser.parameters.json";
    public static final String RESULT_FILE_EXTER_JSON = "homework.result.exter.parameters.json";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //3) Считать получившийся homework.parameters.json в память
        System.out.println("Считываем данные из файла " + SOURCE_FILE + "\n");
        JsonFileClass srcData = new JsonReaderHomework().read(SOURCE_FILE);
        System.out.println(srcData);
        System.out.println();

        //4) Сериализовать его с помощью встроенного механиза сериализации в файл с именем homework.parameters.ser
        System.out.println("Записываем данные в файл " + RESULT_FILE_SER + "\n");
        new SerializeWriterHomework().write(srcData, RESULT_FILE_SER);

        //5) Сериализовать его с использованием интерфейса Externalizable в файл с именем homework.parameters.exter
        JsonFileClassExternalize srcDataExternalize = new JsonReaderExternalizeHomework().read(SOURCE_FILE);
        System.out.println("Записываем данные в файл " + RESULT_FILE_EXTER + "\n");
        new ExternalizeWriterHomework().write(srcDataExternalize, RESULT_FILE_EXTER);


        //6) Считать данные из файла homework.parameters.ser в память и сохранить в формате JSON в файл с именем homework.result.ser.parameters.json
        JsonFileClass jsonFileClass = new SerializeReaderHomework().read(RESULT_FILE_SER);
        System.out.println("Записываем данные в файл " + RESULT_FILE_SER_JSON + "\n");
        new JsonWriterHomework().write(jsonFileClass, RESULT_FILE_SER_JSON);

        //7) Считать данные из файла homework.parameters.exter в память и сохранить в формате JSON в файл с именем homework.result.exter.parameters.json
        JsonFileClassExternalize jsonFileClassExternalize = new ExternalizeReaderHomework().read(RESULT_FILE_EXTER);
        System.out.println("Записываем данные в файл " + RESULT_FILE_EXTER_JSON + "\n");
        new JsonWriterExternalizeHomework().write(jsonFileClassExternalize, RESULT_FILE_EXTER_JSON);

    }
}
