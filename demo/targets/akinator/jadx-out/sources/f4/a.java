package f4;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f55340a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(new Handler());
        this.f55340a = cVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        Cursor cursor;
        c cVar = this.f55340a;
        if (!cVar.f55343c || (cursor = cVar.f55344e) == null || cursor.isClosed()) {
            return;
        }
        cVar.f55342b = cVar.f55344e.requery();
    }
}
