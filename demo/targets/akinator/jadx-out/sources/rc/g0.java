package rc;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0[] f84188b = new a0[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Annotation[] f84189c = new Annotation[0];

    /* renamed from: a, reason: collision with root package name */
    public final jc.c f84190a;

    public g0(jc.c cVar) {
        this.f84190a = cVar;
    }

    public final y a(y yVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            yVar = yVar.addOrOverride(annotation);
            if (this.f84190a.isAnnotationBundle(annotation)) {
                yVar = d(yVar, annotation);
            }
        }
        return yVar;
    }

    public final y b(Annotation[] annotationArr) {
        y yVarEmptyCollector = y.emptyCollector();
        for (Annotation annotation : annotationArr) {
            yVarEmptyCollector = yVarEmptyCollector.addOrOverride(annotation);
            if (this.f84190a.isAnnotationBundle(annotation)) {
                yVarEmptyCollector = d(yVarEmptyCollector, annotation);
            }
        }
        return yVarEmptyCollector;
    }

    public final y c(y yVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!yVar.isPresent(annotation)) {
                yVar = yVar.addOrOverride(annotation);
                jc.c cVar = this.f84190a;
                if (cVar.isAnnotationBundle(annotation)) {
                    for (Annotation annotation2 : dd.i.findClassAnnotations(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !yVar.isPresent(annotation2)) {
                            yVar = yVar.addOrOverride(annotation2);
                            if (cVar.isAnnotationBundle(annotation2)) {
                                yVar = d(yVar, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return yVar;
    }

    public final y d(y yVar, Annotation annotation) {
        for (Annotation annotation2 : dd.i.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.f84190a.isAnnotationBundle(annotation2)) {
                    yVar = yVar.addOrOverride(annotation2);
                } else if (!yVar.isPresent(annotation2)) {
                    yVar = d(yVar.addOrOverride(annotation2), annotation2);
                }
            }
        }
        return yVar;
    }
}
