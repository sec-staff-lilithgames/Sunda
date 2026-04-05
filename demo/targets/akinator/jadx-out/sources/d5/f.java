package d5;

import androidx.lifecycle.g3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f extends g3 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f51858c = new e();

    /* renamed from: a, reason: collision with root package name */
    public final u1 f51859a = new u1();

    /* renamed from: b, reason: collision with root package name */
    public boolean f51860b = false;

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        u1 u1Var = this.f51859a;
        if (u1Var.size() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < u1Var.size(); i10++) {
                c cVar = (c) u1Var.valueAt(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(u1Var.keyAt(i10));
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.g(str2, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // androidx.lifecycle.g3
    public final void onCleared() {
        super.onCleared();
        u1 u1Var = this.f51859a;
        int size = u1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) u1Var.valueAt(i10)).f(true);
        }
        u1Var.clear();
    }
}
