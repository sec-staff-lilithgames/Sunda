package sd;

import j1.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {
    public static <TInput, TResult, TException extends Throwable> TResult retry(int i10, TInput tinput, a aVar, c cVar) throws Throwable {
        TResult tresult;
        if (i10 < 1) {
            return (TResult) ((ha.a) aVar).apply(tinput);
        }
        do {
            tresult = (TResult) ((ha.a) aVar).apply(tinput);
            tinput = (TInput) ((u) cVar).shouldRetry(tinput, tresult);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresult;
    }
}
