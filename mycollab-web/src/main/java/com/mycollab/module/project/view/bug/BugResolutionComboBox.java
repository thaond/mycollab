/**
 * Copyright © MyCollab
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.project.view.bug;

import com.mycollab.module.project.i18n.OptionI18nEnum.BugResolution;
import com.mycollab.vaadin.web.ui.I18nValueComboBox;

import static com.mycollab.module.project.i18n.OptionI18nEnum.BugResolution.*;

/**
 * @author MyCollab Ltd.
 * @since 1.0
 */
class BugResolutionComboBox extends I18nValueComboBox<BugResolution> {
    private static final long serialVersionUID = 1L;

    private BugResolutionComboBox(boolean nullIsAllowable, BugResolution... values) {
        super(BugResolution.class, nullIsAllowable, values);
    }

    static BugResolutionComboBox getInstanceForResolvedBugWindow() {
        return new BugResolutionComboBox(false, Fixed, CannotReproduce, Duplicate, Invalid, InComplete);
    }
}
