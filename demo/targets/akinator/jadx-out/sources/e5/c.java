package e5;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f53744a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f53745b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f53746c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53747d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53748e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53749f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53750g = false;

    public c(Context context) {
        this.f53745b = context.getApplicationContext();
    }

    public void abandon() {
        this.f53747d = true;
    }

    public boolean cancelLoad() {
        return false;
    }

    public void commitContentChanged() {
        this.f53750g = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        w3.c.buildShortClassTag(obj, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f53744a);
        printWriter.print(" mListener=");
        printWriter.println((Object) null);
        if (this.f53746c || this.f53749f || this.f53750g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f53746c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f53749f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f53750g);
        }
        if (this.f53747d || this.f53748e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f53747d);
            printWriter.print(" mReset=");
            printWriter.println(this.f53748e);
        }
    }

    public Context getContext() {
        return this.f53745b;
    }

    public int getId() {
        return this.f53744a;
    }

    public boolean isAbandoned() {
        return this.f53747d;
    }

    public boolean isReset() {
        return this.f53748e;
    }

    public boolean isStarted() {
        return this.f53746c;
    }

    public void onContentChanged() {
        if (this.f53746c) {
            forceLoad();
        } else {
            this.f53749f = true;
        }
    }

    public void registerListener(int i10, b bVar) {
        this.f53744a = i10;
    }

    public void reset() {
        this.f53748e = true;
        this.f53746c = false;
        this.f53747d = false;
        this.f53749f = false;
        this.f53750g = false;
    }

    public void rollbackContentChanged() {
        if (this.f53750g) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.f53746c = true;
        this.f53748e = false;
        this.f53747d = false;
    }

    public void stopLoading() {
        this.f53746c = false;
    }

    public boolean takeContentChanged() {
        boolean z10 = this.f53749f;
        this.f53749f = false;
        this.f53750g |= z10;
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        w3.c.buildShortClassTag(this, sb2);
        sb2.append(" id=");
        return a.b.f(this.f53744a, "}", sb2);
    }

    public void unregisterListener(b bVar) {
        throw new IllegalStateException("No listener register");
    }

    public void unregisterOnLoadCanceledListener(a aVar) {
        throw new IllegalStateException("No listener register");
    }

    public void deliverCancellation() {
    }

    public void forceLoad() {
    }

    public void deliverResult(Object obj) {
    }

    public void registerOnLoadCanceledListener(a aVar) {
    }
}
