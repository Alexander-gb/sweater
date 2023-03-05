package Notes;

//1.Дописать проект, "Записки", содержащий работу с записками из консоли (можно прочитать все записки, создать одну записку,
// отредактировать записку, удалить, и прочитать одну записку по ID), записка содержит в себе как минимум 3 поля Id, заголовок и текст,
// можно добавить дату. Хранение по вашему выбору, можно в текстовом файле (или каждая записка в одном файле, как вам удобнее).
// Можно добавить логирование.
//2.Продумать, какие паттерны можно использовать в вашем проекте


public class Main {
    public static void main(String[] args) throws Exception  {
        System.out.println("Записка:");
        Input input = new Input();
        Notes notes = input.inputFromConsole();

        Persister persister = new Persister("Notes");
        persister.saveToTXT(notes);
        Reader.read();

    }

}
