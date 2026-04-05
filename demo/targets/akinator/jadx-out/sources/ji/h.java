package ji;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final g f69588c = new g();

    /* renamed from: a, reason: collision with root package name */
    public final ni.d f69589a;

    /* renamed from: b, reason: collision with root package name */
    public e f69590b;

    public h(ni.d dVar) {
        this.f69589a = dVar;
        this.f69590b = f69588c;
    }

    public void clearLog() {
        this.f69590b.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.f69590b.getLogAsBytes();
    }

    public String getLogString() {
        return this.f69590b.getLogAsString();
    }

    public final void setCurrentSession(String str) {
        this.f69590b.closeLogFile();
        this.f69590b = f69588c;
        if (str == null) {
            return;
        }
        this.f69590b = new q(this.f69589a.getSessionFile(str, "userlog"));
    }

    public void writeToLog(long j10, String str) {
        this.f69590b.writeToLog(j10, str);
    }

    public h(ni.d dVar, String str) {
        this(dVar);
        setCurrentSession(str);
    }
}
