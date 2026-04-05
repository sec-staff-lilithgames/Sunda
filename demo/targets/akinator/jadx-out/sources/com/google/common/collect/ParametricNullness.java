package com.google.common.collect;

import com.facebook.ads.redexgen.core.EnumC2641pT;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull(when = EnumC2641pT.A05)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: assets/audience_network.dex */
public @interface ParametricNullness {
}
