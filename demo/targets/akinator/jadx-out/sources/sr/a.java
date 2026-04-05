package sr;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86114a;

    public a(String str) {
        this.f86114a = str;
    }

    public String a(Object obj, String str, rr.b bVar, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(C3191e4.i.f36529d);
            sb2.append(obj);
            sb2.append("] ");
        }
        if (str != null) {
            sb2.append(str);
        } else if (bVar != null) {
            sb2.append((String) bVar.get());
        }
        if (th2 != null) {
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            StringWriter stringWriter = new StringWriter(NotificationCompat.FLAG_LOCAL_ONLY);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            sb2.append(stringWriter.toString());
        }
        return sb2.toString();
    }

    public final void b(int i10, Object obj, String str, rr.b bVar, Throwable th2) {
        String strA = a(obj, str, bVar, th2);
        int length = strA.length();
        String str2 = this.f86114a;
        if (length <= 1000) {
            Log.println(i10, str2, strA);
            return;
        }
        int length2 = (strA.length() + 999) / 1000;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length2) {
            int i13 = i12 + 1000;
            Log.println(i10, str2, strA.substring(i12, Math.min(strA.length(), i13)));
            i11++;
            i12 = i13;
        }
    }

    @Override // sr.c
    public void d(Object obj, String str) {
        b(3, obj, str, null, null);
    }

    @Override // sr.c
    public void e(Object obj, String str) {
        b(6, obj, str, null, null);
    }

    @Override // sr.c
    public void w(Object obj, String str) {
        b(5, obj, str, null, null);
    }

    @Override // sr.c
    public void d(String str) {
        b(3, null, str, null, null);
    }

    @Override // sr.c
    public void e(String str) {
        b(6, null, str, null, null);
    }

    @Override // sr.c
    public void w(String str) {
        b(5, null, str, null, null);
    }

    @Override // sr.c
    public void d(Object obj, rr.b bVar) {
        b(3, obj, null, bVar, null);
    }

    @Override // sr.c
    public void e(Object obj, rr.b bVar) {
        b(6, obj, null, bVar, null);
    }

    @Override // sr.c
    public void w(Object obj, rr.b bVar) {
        b(5, obj, null, bVar, null);
    }

    @Override // sr.c
    public void d(rr.b bVar) {
        b(3, null, null, bVar, null);
    }

    @Override // sr.c
    public void e(rr.b bVar) {
        b(6, null, null, bVar, null);
    }

    @Override // sr.c
    public void w(rr.b bVar) {
        b(5, null, null, bVar, null);
    }

    @Override // sr.c
    public void w(Throwable th2) {
        b(5, null, null, null, th2);
    }
}
