import message_block.MessageBlock1;

public class Main {
    private static final String MSG_MT_192 = "{1:F21COPZBEB0AXXX0377002853}{4:{177:1108050226}{451:0}}{1:F21COPZBEB0AXXX0377002853}{2:O1921519110804LRLRXXXX4A1100009044761108041720U}{3:{108:MT192 006 OF 014}{121:daf8e426-26c9-4fdb-b37e-767b8179050d}}{4:\n" +
            ":20:00245\n" +
            ":21:1900650BET\n" +
            ":11S:103\n" +
            "000103\n" +
            ":79:/AGNT/Incorrect Agent\n" +
            ":32A:001226EUR1101,50\n" +
            "-}{5:{MAC:00000000}{CHK:217F2A63931D}{TNG:}}{S:{SAC:}{COP:P}}";

    public static void main(String[] args) {
        String[] msg = MSG_MT_192.split("\\{|\\}");
        System.out.println(msg[1]);
        MessageBlock1 b1 = new MessageBlock1();
        b1.setAppID(msg[1].substring(2, 3));
        b1.setServiceID(msg[1].substring(3, 5));
        b1.setLTAddress(msg[1].substring(5, 17));
        b1.setSessionNumber(msg[1].substring(17, 21));
        b1.setSequenceNumber(msg[1].substring(21, 27));

    }
}