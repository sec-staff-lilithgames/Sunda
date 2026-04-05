package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u1 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public r2 f6016b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6017c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends u1 {
        public a(String str) {
            super(str);
        }
    }

    public u1(String str) {
        super(str);
        this.f6016b = null;
    }

    public static u1 a() {
        return new u1("Protocol message end-group tag did not match expected tag.");
    }

    public static u1 b() {
        return new u1("Protocol message contained an invalid tag (zero).");
    }

    public static u1 c() {
        return new u1("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static u1 e() {
        return new u1("CodedInputStream encountered a malformed varint.");
    }

    public static u1 f() {
        return new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static u1 g() {
        return new u1("Failed to parse the message.");
    }

    public static u1 h() {
        return new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public r2 getUnfinishedMessage() {
        return this.f6016b;
    }

    public u1 setUnfinishedMessage(r2 r2Var) {
        this.f6016b = r2Var;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public u1(Exception exc) {
        super(exc.getMessage(), exc);
        this.f6016b = null;
    }

    public u1(String str, Exception exc) {
        super(str, exc);
        this.f6016b = null;
    }

    public u1(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f6016b = null;
    }

    public u1(String str, IOException iOException) {
        super(str, iOException);
        this.f6016b = null;
    }
}
