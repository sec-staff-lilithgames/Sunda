package ww;

import java.util.Stack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Stack f91306a = new Stack();

    public void push(b bVar) {
        this.f91306a.push(bVar);
    }

    @Override // ww.b
    public String replace(String str) {
        String strReplace;
        Stack stack = this.f91306a;
        int size = stack.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            strReplace = ((b) stack.get(size)).replace(str);
        } while (strReplace == null);
        return strReplace;
    }
}
