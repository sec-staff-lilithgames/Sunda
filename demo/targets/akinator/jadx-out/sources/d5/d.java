package d5;

import android.util.Log;
import androidx.lifecycle.u1;
import java.io.PrintWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public final e5.c f51857b;

    public d(e5.c cVar) {
        this.f51857b = cVar;
    }

    public void dump(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mDeliveredData=");
        printWriter.println(false);
    }

    @Override // androidx.lifecycle.u1
    public void onChanged(Object obj) {
        if (g.f51861c) {
            StringBuilder sb2 = new StringBuilder("  onLoadFinished in ");
            e5.c cVar = this.f51857b;
            sb2.append(cVar);
            sb2.append(": ");
            sb2.append(cVar.dataToString(obj));
            Log.v("LoaderManager", sb2.toString());
        }
        throw null;
    }

    public String toString() {
        throw null;
    }
}
