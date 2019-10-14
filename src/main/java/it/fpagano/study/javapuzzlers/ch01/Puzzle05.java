package it.fpagano.study.javapuzzlers.ch01;

public class Puzzle05 {
    
    /**
     * Long.toHexString(0xcafebabe); ==> "ffffffffcafebabe"
     * Long.toHexString(0xcafebabeL); ==> "cafebabe"
     * @return
     */
    public String sumTwoHexString() {
        return Long.toHexString(0x100000000L + 0xcafebabe);
    }
}