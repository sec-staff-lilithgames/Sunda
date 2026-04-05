package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements h0 {
    @Override // zw.h0
    public Character read(String str) throws Exception {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new x("Cannot convert '%s' to a character", str);
    }

    @Override // zw.h0
    public String write(Character ch2) throws Exception {
        return ch2.toString();
    }
}
