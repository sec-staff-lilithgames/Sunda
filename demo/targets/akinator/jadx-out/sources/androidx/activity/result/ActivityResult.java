package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f4651b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f4652c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4650e = new a(null);
    public static final Parcelable.Creator<ActivityResult> CREATOR = new i.a();

    public ActivityResult(int i10, Intent intent) {
        this.f4651b = i10;
        this.f4652c = intent;
    }

    public static final String resultCodeToString(int i10) {
        return f4650e.resultCodeToString(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getData() {
        return this.f4652c;
    }

    public final int getResultCode() {
        return this.f4651b;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f4650e.resultCodeToString(this.f4651b) + ", data=" + this.f4652c + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        e0.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f4651b);
        Intent intent = this.f4652c;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        e0.checkNotNullParameter(parcel, "parcel");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final String resultCodeToString(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}
