package tj;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface f {
    Task<Void> delete();

    Task<String> getId();

    Task<k> getToken(boolean z10);

    uj.b registerFidListener(uj.a aVar);
}
