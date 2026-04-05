package kn;

import android.database.SQLException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends IOException {
    public a(SQLException sQLException) {
        super(sQLException);
    }

    public a(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
