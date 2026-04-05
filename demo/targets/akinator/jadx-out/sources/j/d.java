package j;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends j.a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    @Override // j.a
    public Intent createIntent(Context context, Intent input) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // j.a
    public ActivityResult parseResult(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
