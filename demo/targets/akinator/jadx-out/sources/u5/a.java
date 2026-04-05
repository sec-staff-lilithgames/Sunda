package u5;

import android.database.Cursor;
import android.database.CursorWrapper;
import kotlin.jvm.internal.e0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends CursorWrapper {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f87857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int[] f87858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Cursor cursor, String[] strArr, int[] iArr) {
        super(cursor);
        this.f87857b = strArr;
        this.f87858c = iArr;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndex(String columnName) {
        e0.checkNotNullParameter(columnName, "columnName");
        String[] strArr = this.f87857b;
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            if (k0.equals(strArr[i10], columnName, true)) {
                return this.f87858c[i11];
            }
            i10++;
            i11 = i12;
        }
        return super.getColumnIndex(columnName);
    }
}
