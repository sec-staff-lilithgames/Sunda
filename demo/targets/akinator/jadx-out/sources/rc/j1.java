package rc;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import tb.l1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface j1 {
    boolean isCreatorVisible(Member member);

    boolean isCreatorVisible(l lVar);

    boolean isFieldVisible(Field field);

    boolean isFieldVisible(i iVar);

    boolean isGetterVisible(Method method);

    boolean isGetterVisible(m mVar);

    boolean isIsGetterVisible(Method method);

    boolean isIsGetterVisible(m mVar);

    boolean isSetterVisible(Method method);

    boolean isSetterVisible(m mVar);

    j1 with(tb.i iVar);

    j1 with(tb.j jVar);

    j1 withCreatorVisibility(tb.i iVar);

    j1 withFieldVisibility(tb.i iVar);

    j1 withGetterVisibility(tb.i iVar);

    j1 withIsGetterVisibility(tb.i iVar);

    j1 withOverrides(tb.h hVar);

    j1 withSetterVisibility(tb.i iVar);

    j1 withVisibility(l1 l1Var, tb.i iVar);
}
