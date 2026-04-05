package n6;

import androidx.lifecycle.l1;
import java.util.Collections;
import java.util.List;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v0 {
    public static v0 combine(List<v0> list) {
        return list.get(0).a(list);
    }

    public abstract o6.d0 a(List list);

    public abstract j0 enqueue();

    public abstract n1 getWorkInfos();

    public abstract l1 getWorkInfosLiveData();

    public abstract v0 then(List<f0> list);

    public final v0 then(f0 f0Var) {
        return then(Collections.singletonList(f0Var));
    }
}
