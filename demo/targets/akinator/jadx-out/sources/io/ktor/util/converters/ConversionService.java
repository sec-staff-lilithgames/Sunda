package io.ktor.util.converters;

import io.ktor.util.reflect.TypeInfo;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ConversionService {
    Object fromValues(List<String> list, TypeInfo typeInfo);

    List<String> toValues(Object obj);
}
