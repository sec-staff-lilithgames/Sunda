package um;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static c0 f88564c = c0.error;

    /* renamed from: a, reason: collision with root package name */
    public final String f88565a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f88566b = new CopyOnWriteArrayList();

    public e0(String str) {
        this.f88565a = str;
    }

    public final void a(c0 c0Var, String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        c0 c0Var2 = f88564c;
        boolean z10 = c0Var2 != null && c0Var2.getValue() <= c0Var.getValue();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88566b;
        boolean zIsEmpty = copyOnWriteArrayList.isEmpty();
        if (z10 || !zIsEmpty) {
            String strM = a.b.m(C3191e4.i.f36529d, str, "] ", str2);
            if (objArr != null && objArr.length != 0) {
                try {
                    strM = String.format(strM, objArr);
                } catch (Throwable unused) {
                }
            }
            if (z10) {
                int i10 = d0.f88561a[c0Var.ordinal()];
                String str3 = this.f88565a;
                if (i10 == 1) {
                    Log.d(str3, strM);
                } else if (i10 == 2) {
                    Log.e(str3, strM);
                } else if (i10 == 3) {
                    Log.w(str3, strM);
                }
            }
            if (zIsEmpty) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
        }
    }

    public void addLogListener(b0 b0Var) {
        if (b0Var != null) {
            this.f88566b.add(b0Var);
        }
    }

    public boolean canSendDLog() {
        c0 c0Var = f88564c;
        return (c0Var != null && c0Var.getValue() <= c0.debug.getValue()) || !this.f88566b.isEmpty();
    }

    public boolean canSendELog() {
        c0 c0Var = f88564c;
        return (c0Var != null && c0Var.getValue() <= c0.error.getValue()) || !this.f88566b.isEmpty();
    }

    public boolean canSendWLog() {
        c0 c0Var = f88564c;
        return (c0Var != null && c0Var.getValue() <= c0.warning.getValue()) || !this.f88566b.isEmpty();
    }

    public void d(String str, String str2, Object... objArr) {
        a(c0.debug, str, str2, objArr);
    }

    public void e(String str, String str2, Object... objArr) {
        a(c0.error, str, str2, objArr);
    }

    public c0 getLoggingLevel() {
        return f88564c;
    }

    public boolean removeLogListener(b0 b0Var) {
        return b0Var != null && this.f88566b.remove(b0Var);
    }

    public void setLoggingLevel(c0 c0Var) {
        Log.d(this.f88565a, "Changing logging level. From: " + f88564c + ", To: " + c0Var);
        f88564c = c0Var;
    }

    public void w(String str, String str2, Object... objArr) {
        a(c0.warning, str, str2, objArr);
    }

    public void e(String str, Throwable th2) {
        a(c0.error, str, th2.toString(), new Object[0]);
    }
}
