/*
 * SPDX-License-Identifier: (MIT OR CECILL-C)
 *
 * Copyright (C) 2006-2023 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) or the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
package spoon.reflect.code;

import java.util.List;
import spoon.reflect.annotations.PropertyGetter;
import spoon.reflect.annotations.PropertySetter;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.template.TemplateParameter;

import static spoon.reflect.path.CtRole.CAST;

/**
 * This abstract code element defines a typed expression.
 *
 * @param <T>
 * 		the "return type" of this expression
 */
public interface CtExpression<T> extends CtCodeElement, CtTypedElement<T>, TemplateParameter<T> {

	/**
	 * Returns the type casts if any.
	 * @return this object
	 */
	@PropertyGetter(role = CAST)
	List<CtTypeReference<?>> getTypeCasts();

	/**
	 * Sets the type casts.
	 * @return this object
	 */
	@PropertySetter(role = CAST)
	<C extends CtExpression<T>> C setTypeCasts(List<CtTypeReference<?>> types);

	/**
	 * Adds a type cast.
	 * @return this object
	 */
	@PropertySetter(role = CAST)
	<C extends CtExpression<T>> C addTypeCast(CtTypeReference<?> type);

	@Override
	CtExpression<T> clone();
}
