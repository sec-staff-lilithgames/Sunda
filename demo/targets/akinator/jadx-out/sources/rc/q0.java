package rc;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q0 {
    public static ParameterizedType a(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return a(upperBounds[0]);
            }
        }
        return null;
    }

    public static TypeVariable b(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return b(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean c(g1 g1Var, jc.o oVar, Type type) {
        if (!oVar.isTypeOrSubTypeOf(g1Var.resolveType(type).getRawClass())) {
            return false;
        }
        ParameterizedType parameterizedTypeA = a(type);
        if (parameterizedTypeA == null || !Objects.equals(oVar.getRawClass(), parameterizedTypeA.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = parameterizedTypeA.getActualTypeArguments();
        cd.r bindings = oVar.getBindings();
        if (bindings.size() != actualTypeArguments.length) {
            return false;
        }
        for (int i10 = 0; i10 < bindings.size(); i10++) {
            if (!c(g1Var, bindings.getBoundType(i10), actualTypeArguments[i10])) {
                return false;
            }
        }
        return true;
    }

    public static g1 narrowMethodTypeParameters(Method method, jc.o oVar, cd.s sVar, g1 g1Var) {
        jc.o boundTypeOrNull;
        TypeVariable<Method> typeVariable;
        TypeVariable<Method>[] typeParameters = method.getTypeParameters();
        cd.r rVarCreate = null;
        if (typeParameters.length != 0 && !oVar.getBindings().isEmpty()) {
            Type genericReturnType = method.getGenericReturnType();
            if (genericReturnType instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
                if (Objects.equals(oVar.getRawClass(), parameterizedType.getRawType())) {
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    ArrayList arrayList = new ArrayList(typeParameters.length);
                    ArrayList arrayList2 = new ArrayList(typeParameters.length);
                    int i10 = 0;
                    while (true) {
                        if (i10 < actualTypeArguments.length) {
                            TypeVariable typeVariableB = b(actualTypeArguments[i10]);
                            if (typeVariableB != null) {
                                String name = typeVariableB.getName();
                                if (name == null || (boundTypeOrNull = oVar.getBindings().getBoundTypeOrNull(i10)) == null) {
                                    break;
                                }
                                int length = typeParameters.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= length) {
                                        typeVariable = null;
                                        break;
                                    }
                                    typeVariable = typeParameters[i11];
                                    if (name.equals(typeVariable.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (typeVariable == null) {
                                    break;
                                }
                                Type[] bounds = typeVariable.getBounds();
                                int length2 = bounds.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length2) {
                                        int iIndexOf = arrayList.indexOf(name);
                                        if (iIndexOf != -1) {
                                            jc.o oVar2 = (jc.o) arrayList2.get(iIndexOf);
                                            if (!boundTypeOrNull.equals(oVar2)) {
                                                boolean zIsTypeOrSubTypeOf = oVar2.isTypeOrSubTypeOf(boundTypeOrNull.getRawClass());
                                                boolean zIsTypeOrSubTypeOf2 = boundTypeOrNull.isTypeOrSubTypeOf(oVar2.getRawClass());
                                                if (!zIsTypeOrSubTypeOf && !zIsTypeOrSubTypeOf2) {
                                                    break;
                                                }
                                                if ((zIsTypeOrSubTypeOf ^ zIsTypeOrSubTypeOf2) && zIsTypeOrSubTypeOf2) {
                                                    arrayList2.set(iIndexOf, boundTypeOrNull);
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            arrayList.add(name);
                                            arrayList2.add(boundTypeOrNull);
                                        }
                                    } else {
                                        if (!c(g1Var, boundTypeOrNull, bounds[i12])) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                            i10++;
                        } else if (!arrayList.isEmpty()) {
                            rVarCreate = cd.r.create(arrayList, arrayList2);
                        }
                    }
                }
            }
        }
        return rVarCreate == null ? g1Var : new f1(sVar, rVarCreate);
    }
}
