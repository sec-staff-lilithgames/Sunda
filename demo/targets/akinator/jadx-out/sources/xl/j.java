package xl;

import br.a1;
import br.b0;
import br.b1;
import br.c0;
import br.c1;
import br.d;
import br.d0;
import br.d1;
import br.d2;
import br.e;
import br.e2;
import br.f2;
import br.g0;
import br.g1;
import br.h1;
import br.i0;
import br.j0;
import br.l0;
import br.l1;
import br.n0;
import br.n1;
import br.o1;
import br.p;
import br.p0;
import br.q;
import br.r1;
import br.s;
import br.s1;
import br.u1;
import br.x1;
import br.z0;
import br.z1;
import com.explorestack.protobuf.ka;
import hr.o;
import io.bidmachine.protobuf.rendering.Rendering;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import sn.t;
import uu.p1;
import uu.q0;
import uu.u0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j extends o {

    /* renamed from: b, reason: collision with root package name */
    public final br.d f92036b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xu.d.compareValues(Integer.valueOf(((Rendering.Phase) obj).getSequence()), Integer.valueOf(((Rendering.Phase) obj2).getSequence()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(hr.k unifiedMediationParams) {
        super(unifiedMediationParams);
        e0.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Object objectOrNull = unifiedMediationParams.getObjectOrNull("rendering_configuration");
        if (!(objectOrNull instanceof Rendering)) {
            this.f92036b = null;
            return;
        }
        e2.a aVar = new e2.a();
        Float floatOrNull = unifiedMediationParams.getFloatOrNull("viewability_pixel_threshold");
        if (floatOrNull != null) {
            aVar.setVisibilityPercent(floatOrNull.floatValue());
        }
        Boolean booleanOrNull = unifiedMediationParams.getBooleanOrNull("viewability_ignore_window_focus");
        if (booleanOrNull != null) {
            aVar.setIgnoreWindowFocus(booleanOrNull.booleanValue());
        }
        Boolean booleanOrNull2 = unifiedMediationParams.getBooleanOrNull("viewability_ignore_overlap");
        if (booleanOrNull2 != null) {
            aVar.setIgnoreOverlap(booleanOrNull2.booleanValue());
        }
        this.f92036b = createAdParams((Rendering) objectOrNull, aVar.build());
    }

    public static HashMap a(List list) {
        br.l lVar;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rendering.AdaptiveAnimation adaptiveAnimation = (Rendering.AdaptiveAnimation) it.next();
            br.i iVar = br.i.f9870c.get(adaptiveAnimation.getEvent());
            if (iVar != null) {
                Rendering.AdaptiveAnimation.Style style = adaptiveAnimation.getStyle();
                e0.checkNotNullExpressionValue(style, "it.style");
                if (style.hasFade()) {
                    Rendering.AdaptiveAnimation.FadeAnimationOption fade = style.getFade();
                    e0.checkNotNullExpressionValue(fade, "style.fade");
                    Rendering.AdaptiveAnimation.Timing timing = fade.getTiming();
                    e0.checkNotNullExpressionValue(timing, "fadeAnimationOption.timing");
                    lVar = new br.l(iVar, br.n.Fade, br.k.f9883c.get(timing.getFunction()), n.getDurationMs(timing), null);
                } else if (style.hasSlide()) {
                    Rendering.AdaptiveAnimation.SlideAnimationOption slide = style.getSlide();
                    e0.checkNotNullExpressionValue(slide, "style.slide");
                    Rendering.AdaptiveAnimation.Timing timing2 = slide.getTiming();
                    e0.checkNotNullExpressionValue(timing2, "slideAnimationOption.timing");
                    lVar = new br.l(iVar, br.n.Slide, br.k.f9883c.get(timing2.getFunction()), n.getDurationMs(timing2), br.g.f9831c.get(slide.getDirection()));
                }
                map.put(iVar, lVar);
            }
        }
        return map;
    }

    public static p b(Rendering.Background background) {
        q b1Var;
        o1 c1Var;
        n1 n1Var = null;
        if (background == null || background == Rendering.Background.getDefaultInstance()) {
            return null;
        }
        if (background.hasColor()) {
            c0 c0VarC = c(background.getColor());
            if (c0VarC != null) {
                b1Var = new d0(c0VarC);
            } else {
                nm.a.e(new t(25));
                b1Var = null;
            }
        } else {
            if (background.hasImage()) {
                a1 a1VarD = d(background.getImage());
                if (a1VarD != null) {
                    b1Var = new b1(a1VarD);
                } else {
                    nm.a.e(new g(0));
                }
            } else {
                nm.a.e(new g(1));
            }
            b1Var = null;
        }
        float opacity = (float) background.getOpacity();
        Rendering.Placeholder placeholder = background.getPlaceholder();
        if (placeholder != null && placeholder != Rendering.Placeholder.getDefaultInstance()) {
            if (placeholder.hasName()) {
                String name = placeholder.getName();
                e0.checkNotNullExpressionValue(name, "placeholder.name");
                c1Var = new h1(name);
            } else if (placeholder.hasColor()) {
                c0 c0VarC2 = c(placeholder.getColor());
                if (c0VarC2 != null) {
                    c1Var = new br.e0(c0VarC2);
                }
            } else if (placeholder.hasImage()) {
                a1 a1VarD2 = d(placeholder.getImage());
                if (a1VarD2 != null) {
                    c1Var = new c1(a1VarD2);
                }
            } else {
                nm.a.e(new g(6));
                c1Var = null;
            }
            if (c1Var != null) {
                n1Var = new n1(c1Var);
            }
        }
        return new p(opacity, b1Var, n1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static br.c0 c(io.bidmachine.protobuf.rendering.Rendering.Color r6) {
        /*
            r0 = 0
            if (r6 == 0) goto Lf5
            io.bidmachine.protobuf.rendering.Rendering$Color r1 = io.bidmachine.protobuf.rendering.Rendering.Color.getDefaultInstance()
            if (r6 != r1) goto Lb
            goto Lf5
        Lb:
            boolean r1 = r6.hasColor()
            if (r1 == 0) goto L30
            java.lang.String r6 = r6.getColor()
            java.lang.Integer r6 = ir.q.parseColorSafely(r6)
            if (r6 != 0) goto L25
            xl.g r6 = new xl.g
            r1 = 7
            r6.<init>(r1)
            nm.a.e(r6)
            return r0
        L25:
            br.i1 r1 = new br.i1
            int r6 = r6.intValue()
            r1.<init>(r6)
            goto Lec
        L30:
            boolean r1 = r6.hasGradient()
            if (r1 == 0) goto Le1
            io.bidmachine.protobuf.rendering.Rendering$Color$Gradient r6 = r6.getGradient()
            if (r6 == 0) goto L5e
            io.bidmachine.protobuf.rendering.Rendering$Color$Gradient r1 = io.bidmachine.protobuf.rendering.Rendering.Color.Gradient.getDefaultInstance()
            if (r6 != r1) goto L43
            goto L5e
        L43:
            java.lang.String r1 = r6.getType()
            java.lang.String r2 = "gradient.type"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            br.u0 r2 = br.w0.f10007c
            br.w0 r2 = r2.get(r1)
            if (r2 != 0) goto L60
            c3.c r6 = new c3.c
            r2 = 18
            r6.<init>(r1, r2)
            nm.a.e(r6)
        L5e:
            r6 = r0
            goto Lce
        L60:
            java.lang.String r1 = r6.getDirection()
            java.lang.String r3 = "gradient.direction"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r3)
            br.s0 r3 = br.t0.f9991c
            br.t0 r3 = r3.get(r1)
            if (r3 != 0) goto L7c
            c3.c r6 = new c3.c
            r2 = 19
            r6.<init>(r1, r2)
            nm.a.e(r6)
            goto L5e
        L7c:
            com.explorestack.protobuf.ka r6 = r6.getColorsList()
            java.lang.String r1 = "gradient.colorsList"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r6.iterator()
        L8e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Integer r5 = ir.q.parseColorSafely(r5)
            if (r5 == 0) goto L8e
            r1.add(r5)
            goto L8e
        La4:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto Lb5
            sn.t r6 = new sn.t
            r1 = 28
            r6.<init>(r1)
            nm.a.e(r6)
            goto L5e
        Lb5:
            int r4 = r1.size()
            int r6 = r6.size()
            if (r4 == r6) goto Lc9
            sn.t r6 = new sn.t
            r4 = 29
            r6.<init>(r4)
            nm.a.e(r6)
        Lc9:
            br.q0 r6 = new br.q0
            r6.<init>(r2, r3, r1)
        Lce:
            if (r6 != 0) goto Ldb
            sn.t r6 = new sn.t
            r1 = 26
            r6.<init>(r1)
            nm.a.e(r6)
            return r0
        Ldb:
            br.r0 r1 = new br.r0
            r1.<init>(r6)
            goto Lec
        Le1:
            sn.t r6 = new sn.t
            r1 = 27
            r6.<init>(r1)
            nm.a.e(r6)
            r1 = r0
        Lec:
            if (r1 != 0) goto Lef
            goto Lf5
        Lef:
            br.c0 r6 = new br.c0
            r6.<init>(r1)
            return r6
        Lf5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.j.c(io.bidmachine.protobuf.rendering.Rendering$Color):br.c0");
    }

    public static a1 d(Rendering.Image image) {
        r1 r1VarE;
        if (image == null || image == Rendering.Image.getDefaultInstance() || (r1VarE = e(image.getResource())) == null) {
            return null;
        }
        u1 scaleType = n.toScaleType(image.getScale());
        if (scaleType == null) {
            scaleType = u1.None;
        }
        return new a1(scaleType, r1VarE);
    }

    public static r1 e(Rendering.Resource resource) {
        s1 f2Var;
        if (resource != null && resource != Rendering.Resource.getDefaultInstance()) {
            if (resource.hasBase64()) {
                String base64 = resource.getBase64();
                e0.checkNotNullExpressionValue(base64, "resource.base64");
                f2Var = new s(base64);
            } else if (resource.hasUrl()) {
                String url = resource.getUrl();
                e0.checkNotNullExpressionValue(url, "resource.url");
                f2Var = new d2(url);
            } else {
                if (resource.hasPayload()) {
                    Rendering.Resource.Payload payload = resource.getPayload();
                    e0.checkNotNullExpressionValue(payload, "resource.payload");
                    if (payload.hasHtml()) {
                        String html = payload.getHtml();
                        e0.checkNotNullExpressionValue(html, "payload.html");
                        f2Var = new z0(html);
                    } else if (payload.hasXml()) {
                        String xml = payload.getXml();
                        e0.checkNotNullExpressionValue(xml, "payload.xml");
                        f2Var = new f2(xml);
                    } else {
                        nm.a.e(new g(2));
                    }
                } else {
                    nm.a.e(new g(3));
                }
                f2Var = null;
            }
            if (f2Var != null) {
                return new r1(f2Var);
            }
        }
        return null;
    }

    public final br.d createAdParams(Rendering rendering, e2 visibilityParams) {
        e0.checkNotNullParameter(rendering, "rendering");
        e0.checkNotNullParameter(visibilityParams, "visibilityParams");
        yl.a aVar = new yl.a();
        d.a customParams = new d.a().setOrientation(n.toOrientation(rendering.getOrientation())).setBackground(b(rendering.getBackground())).setVisibilityParams(visibilityParams).setCustomParams(rendering.getCustomParamsMap());
        b0 cacheType = n.toCacheType(rendering.getCacheType());
        if (cacheType != null) {
            customParams.setCacheType(cacheType);
        }
        List<Rendering.Phase> phasesList = rendering.getPhasesList();
        e0.checkNotNullExpressionValue(phasesList, "rendering.phasesList");
        List<Rendering.Phase> mutableList = y0.toMutableList((Collection) phasesList);
        if (mutableList.size() > 1) {
            u0.sortWith(mutableList, new a());
        }
        for (Rendering.Phase phase : mutableList) {
            br.e eVarCreateAdPhaseParams = createAdPhaseParams(phase, aVar);
            if (eVarCreateAdPhaseParams != null) {
                if (phase.getSequence() == -1) {
                    customParams.setPlaceholderParams(eVarCreateAdPhaseParams);
                } else {
                    customParams.addAdPhaseParams(eVarCreateAdPhaseParams);
                }
            }
        }
        return customParams.build();
    }

    public final br.e createAdPhaseParams(Rendering.Phase phase, ar.f fVar) {
        if (phase == null || phase == Rendering.Phase.getDefaultInstance()) {
            return null;
        }
        e.a background = new e.a(phase.getSequence()).setBackground(b(phase.getBackground()));
        List<Rendering.AdaptiveAnimation> animationsList = phase.getAnimationsList();
        e0.checkNotNullExpressionValue(animationsList, "phase.animationsList");
        e.a animationParams = background.setAnimationParams(p1.toMutableMap(a(animationsList)));
        ka stateGroupsList = phase.getStateGroupsList();
        e0.checkNotNullExpressionValue(stateGroupsList, "phase.stateGroupsList");
        e.a customParams = animationParams.setStateGroups(y0.toMutableList((Collection) stateGroupsList)).setCustomParams(phase.getCustomParamsMap());
        Integer colorSafely = ir.q.parseColorSafely(phase.getBackgroundColor());
        if (colorSafely != null) {
            customParams.setBackgroundColor(colorSafely.intValue());
        }
        List<Rendering.Phase.ViewComponent> adsList = phase.getAdsList();
        e0.checkNotNullExpressionValue(adsList, "phase.adsList");
        Iterator<T> it = adsList.iterator();
        while (it.hasNext()) {
            br.a aVarCreateAdElementParams = createAdElementParams((Rendering.Phase.ViewComponent) it.next(), fVar);
            if (aVarCreateAdElementParams != null) {
                customParams.addAdsElementParams(aVarCreateAdElementParams);
            }
        }
        List<Rendering.Phase.ViewComponent> controlsList = phase.getControlsList();
        e0.checkNotNullExpressionValue(controlsList, "phase.controlsList");
        Iterator<T> it2 = controlsList.iterator();
        while (it2.hasNext()) {
            br.a aVarCreateAdElementParams2 = createAdElementParams((Rendering.Phase.ViewComponent) it2.next(), fVar);
            if (aVarCreateAdElementParams2 != null) {
                customParams.addControlsElementParams(aVarCreateAdElementParams2);
            }
        }
        List<Rendering.Phase.Event> eventsList = phase.getEventsList();
        e0.checkNotNullExpressionValue(eventsList, "phase.eventsList");
        Iterator<T> it3 = eventsList.iterator();
        while (it3.hasNext()) {
            i0 i0VarCreateEventParams = createEventParams((Rendering.Phase.Event) it3.next());
            if (i0VarCreateEventParams != null) {
                customParams.addEventParams(i0VarCreateEventParams);
            }
        }
        List<Rendering.Phase.MethodComponent> methodsList = phase.getMethodsList();
        e0.checkNotNullExpressionValue(methodsList, "phase.methodsList");
        Iterator<T> it4 = methodsList.iterator();
        while (it4.hasNext()) {
            String name = ((Rendering.Phase.MethodComponent) it4.next()).getName();
            e0.checkNotNullExpressionValue(name, "methodComponent.name");
            customParams.addMethodParams(new g1(name));
        }
        return customParams.build();
    }

    public final br.o createAppearanceParams(Rendering.Phase.ViewComponent.Appearance appearance) {
        if (appearance == null || appearance == Rendering.Phase.ViewComponent.Appearance.getDefaultInstance()) {
            return new br.o(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        p pVarB = b(appearance.getBackground());
        Integer colorSafely = ir.q.parseColorSafely(appearance.getBackgroundColor());
        Boolean boolValueOf = Boolean.valueOf(appearance.getVisible());
        Boolean boolValueOf2 = Boolean.valueOf(appearance.getClickable());
        Float fValueOf = Float.valueOf((float) appearance.getOpacity());
        Float fValueOf2 = Float.valueOf((float) appearance.getFontSize());
        p0 p0Var = p0.f9970e.get(appearance.getFontStyle());
        Boolean boolValueOf3 = Boolean.valueOf(appearance.getOutlined());
        Float fValueOf3 = Float.valueOf((float) appearance.getStrokeWidth());
        Integer colorSafely2 = ir.q.parseColorSafely(appearance.getStrokeColor());
        Integer colorSafely3 = ir.q.parseColorSafely(appearance.getFillColor());
        Integer colorSafely4 = ir.q.parseColorSafely(appearance.getShadowColor());
        l1 l1Var = l1.f9918e.parse(appearance.getPadding());
        Float fValueOf4 = Float.valueOf((float) appearance.getCornerRadius());
        Integer numValueOf = Integer.valueOf(appearance.getTextNumberOfLines());
        Float fValueOf5 = Float.valueOf((float) appearance.getTextLineSpacing());
        br.y0 y0Var = br.y0.f10023e.get(appearance.getTextAlignment());
        if (y0Var == null) {
            y0Var = br.y0.Center;
        }
        return new br.o(pVarB, colorSafely, boolValueOf, boolValueOf2, fValueOf, fValueOf2, p0Var, boolValueOf3, fValueOf3, colorSafely2, colorSafely3, colorSafely4, l1Var, fValueOf4, numValueOf, fValueOf5, y0Var);
    }

    public final g0 createElementLayoutParams(Rendering.Phase.ViewComponent.Layout layout) {
        g0.a aVar = new g0.a();
        if (layout == null) {
            return aVar.build();
        }
        List<Rendering.Phase.ViewComponent.Layout.Constraint> constraintsList = layout.getConstraintsList();
        e0.checkNotNullExpressionValue(constraintsList, "layout.constraintsList");
        for (Rendering.Phase.ViewComponent.Layout.Constraint constraint : constraintsList) {
            Rendering.Phase.ViewComponent.Layout.Constraint.Anchor sourceAnchor = constraint.getSourceAnchor();
            Rendering.Phase.ViewComponent.Layout.Constraint.Anchor targetAnchor = constraint.getTargetAnchor();
            String target = constraint.getTarget();
            e0.checkNotNullExpressionValue(target, "constraint.target");
            float value = (float) constraint.getValue();
            switch (sourceAnchor == null ? -1 : i.$EnumSwitchMapping$0[sourceAnchor.ordinal()]) {
                case 1:
                    aVar.setWidth(value);
                    aVar.setWidthPercent((float) constraint.getMultiplier());
                    break;
                case 2:
                    aVar.setHeight(value);
                    aVar.setHeightPercent((float) constraint.getMultiplier());
                    break;
                case 3:
                    z1 sideType = n.toSideType(targetAnchor);
                    if (sideType != null) {
                        aVar.setLeftSideBindParams(new x1(sideType, target));
                    }
                    aVar.setMarginLeft(value);
                    break;
                case 4:
                    z1 sideType2 = n.toSideType(targetAnchor);
                    if (sideType2 != null) {
                        aVar.setTopSideBindParams(new x1(sideType2, target));
                    }
                    aVar.setMarginTop(value);
                    break;
                case 5:
                    z1 sideType3 = n.toSideType(targetAnchor);
                    if (sideType3 != null) {
                        aVar.setRightSideBindParams(new x1(sideType3, target));
                    }
                    aVar.setMarginRight(value);
                    break;
                case 6:
                    z1 sideType4 = n.toSideType(targetAnchor);
                    if (sideType4 != null) {
                        aVar.setBottomSideBindParams(new x1(sideType4, target));
                    }
                    aVar.setMarginBottom(value);
                    break;
                case 7:
                    aVar.setTranslationX(value);
                    break;
                case 8:
                    aVar.setTranslationY(value);
                    break;
                default:
                    nm.a.e(new h(sourceAnchor, 0));
                    break;
            }
        }
        return aVar.build();
    }

    public final i0 createEventParams(Rendering.Phase.Event event) {
        n0 eventType;
        if (event == null || event == Rendering.Phase.Event.getDefaultInstance() || (eventType = n.toEventType(event.getName())) == null) {
            return null;
        }
        List<Rendering.Phase.Event.Task> tasksList = event.getTasksList();
        e0.checkNotNullExpressionValue(tasksList, "event.tasksList");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tasksList.iterator();
        while (it.hasNext()) {
            j0 j0VarCreateEventTaskParams = createEventTaskParams((Rendering.Phase.Event.Task) it.next());
            if (j0VarCreateEventTaskParams != null) {
                arrayList.add(j0VarCreateEventTaskParams);
            }
        }
        String source = event.getSource();
        e0.checkNotNullExpressionValue(source, "event.source");
        return new i0(eventType, source, arrayList);
    }

    public final j0 createEventTaskParams(Rendering.Phase.Event.Task task) {
        l0 eventTaskType;
        if (task == null || task == Rendering.Phase.Event.Task.getDefaultInstance() || (eventTaskType = n.toEventTaskType(task.getName())) == null) {
            return null;
        }
        String target = task.getTarget();
        e0.checkNotNullExpressionValue(target, "task.target");
        String value = task.getValue();
        ka stateGroupsList = task.getStateGroupsList();
        e0.checkNotNullExpressionValue(stateGroupsList, "task.stateGroupsList");
        return new j0(eventTaskType, target, value, y0.toList(stateGroupsList));
    }

    public final List<d1> createMeasurerParamsList(List<Rendering.Phase.ViewComponent.Measurer> list) {
        List<Rendering.Phase.ViewComponent.Measurer> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        List<Rendering.Phase.ViewComponent.Measurer> list3 = list;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
        for (Rendering.Phase.ViewComponent.Measurer measurer : list3) {
            String name = measurer.getName();
            e0.checkNotNullExpressionValue(name, "it.name");
            arrayList.add(new d1(name, measurer.getParametersMap()));
        }
        return arrayList;
    }

    public final br.d getAdParams() {
        return this.f92036b;
    }

    @Override // hr.o
    public boolean isValid(hr.c callback) {
        e0.checkNotNullParameter(callback, "callback");
        if (this.f92036b != null) {
            return true;
        }
        callback.onAdLoadFailed(pr.a.notFound("rendering_configuration"));
        return false;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final br.a createAdElementParams(io.bidmachine.protobuf.rendering.Rendering.Phase.ViewComponent r31, ar.f r32) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.j.createAdElementParams(io.bidmachine.protobuf.rendering.Rendering$Phase$ViewComponent, ar.f):br.a");
    }
}
