package org.netbeans.modules.vuecodecompletion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Thymeleaf attributes and documentation
 *
 * @author Artur Wiśniewski
 *
 */
public class VueData {
    

    private static final  Map<String,String[]> TAG_DATA = new HashMap<String,String[]>();
    private static final HashMap<String, String> DOCUMENTATION = new HashMap<String, String>();
    static {
        
        TAG_DATA.put("el-row", "gutter,type,justify,align,tag".split(","));
        DOCUMENTATION.put("el-row","A row in grid system");
        TAG_DATA.put("el-col", "span,offset,push,pull,xs,sm,md,lg,xl,tag".split(","));
        DOCUMENTATION.put("el-col","A column in grid system");
        TAG_DATA.put("el-button", "type,size,plain,loading,disabled,icon,autofocus,native-type,round".split(","));
        DOCUMENTATION.put("el-button","Commonly used button.");
        TAG_DATA.put("el-radio", "label,disabled,border,size,name".split(","));
        DOCUMENTATION.put("el-radio","Single selection among multiple options.");
        TAG_DATA.put("el-radio-group", "size,fill,text-color,change".split(","));
        DOCUMENTATION.put("el-radio-group",null);
        TAG_DATA.put("el-radio-button", "label,disabled".split(","));
        DOCUMENTATION.put("el-radio-button",null);
        TAG_DATA.put("el-checkbox", "label,true-label,false-label,border,size,name,checked,indeterminate,disabled".split(","));
        DOCUMENTATION.put("el-checkbox","A group of options for multiple choices.");
        TAG_DATA.put("el-checkbox-group", "size,fill,text-color,min,max,change".split(","));
        DOCUMENTATION.put("el-checkbox-group",null);
        TAG_DATA.put("el-checkbox-button", "label".split(","));
        DOCUMENTATION.put("el-checkbox-button",null);
        TAG_DATA.put("el-input", "type,value,maxlength,minlength,placeholder,disabled,size,icon,prefix-icon,suffix-icon,rows,autosize,auto-complete,name,readonly,max,min,step,resize,autofocus,form,label,tabindex,clearable,on-icon-click,click,blur,focus,change".split(","));
        DOCUMENTATION.put("el-input","Input data using mouse or keyboard.");
        TAG_DATA.put("el-autocomplete", "value,debounce,placeholder,disabled,props,custom-item,icon,fetch-suggestions,popper-class,trigger-on-focus,on-icon-click,select-when-unmatched,label,prefix-icon,suffix-icon,select".split(","));
        DOCUMENTATION.put("el-autocomplete",null);
        TAG_DATA.put("el-input-number", "value,min,max,step,size,disabled,controls-position,controls,debounce,change".split(","));
        DOCUMENTATION.put("el-input-number",null);
        TAG_DATA.put("el-select", "multiple,disabled,value-key,size,clearable,collapse-tags,multiple-limit,name,placeholder,filterable,allow-create,filter-method,remote,remote-method,loading,loading-text,no-match-text,no-data-text,popper-class,reserve-keyword,default-first-option,change,visible-change,remote-tag".split(","));
        DOCUMENTATION.put("el-select","When there are plenty of options, use a drop-down menu to display and select desired ones.");
        TAG_DATA.put("el-option-group", "label,disabled".split(","));
        DOCUMENTATION.put("el-option-group",null);
        TAG_DATA.put("el-option", "value,label,disabled".split(","));
        DOCUMENTATION.put("el-option",null);
        TAG_DATA.put("el-cascader", "options,props,value,separator,popper-class,placeholder,disabled,clearable,expand-trigger,show-all-levels,filterable,debounce,change-on-select,size,change,active-item-change".split(","));
        DOCUMENTATION.put("el-cascader","If the options have a clear hierarchical structure, Cascader can be used to view and select them.");
        TAG_DATA.put("el-switch", "disabled,width,active-icon-class,inactive-icon-class,active-text,inactive-text,active-value,inactive-value,active-color,inactive-color,on-icon-class,off-icon-class,on-text,off-text,on-value,off-value,on-color,off-color,name,change".split(","));
        DOCUMENTATION.put("el-switch","Switch is used for switching between two opposing states.");
        TAG_DATA.put("el-slider", "min,max,disabled,step,show-input,show-input-controls,show-stops,show-tooltip,format-tooltip,range,vertical,height,debounce,change".split(","));
        DOCUMENTATION.put("el-slider","Drag the slider within a fixed range.");
        TAG_DATA.put("el-time-select", "readonly,editable,disabled,clearable,size,placeholder,value,align,popper-class,picker-options,vertical,height,change".split(","));
        DOCUMENTATION.put("el-time-select",null);
        TAG_DATA.put("el-time-picker", "readonly,editable,disabled,clearable,size,placeholder,start-placeholde,end-placeholde,value,align,picker-options,range-separator,popper-class,is-range,arrow-control,value-format,default-value,change,blur,focus".split(","));
        DOCUMENTATION.put("el-time-picker",null);
        TAG_DATA.put("el-date-picker", "readonly,editable,disabled,clearable,size,placeholder,start-placeholde,end-placeholde,time-arrow-control,type,format,align,popper-class,picker-options,range-separator,default-value,value-format,name,unlink-panels,change".split(","));
        DOCUMENTATION.put("el-date-picker",null);
        TAG_DATA.put("el-upload", "action,headers,multiple,data,name,width,name,with-credentials,show-file-list,drag,accept,on-preview,on-remove,on-success,on-error,on-progress,on-change,before-upload,before-remove,list-type,auto-upload,file-list,http-request,disabled,limit,on-exceed".split(","));
        DOCUMENTATION.put("el-upload","Upload files by clicking or drag-and-drop");
        TAG_DATA.put("el-rate", "max,disabled,allow-half,low-threshold,high-threshold,colors,void-color,disabled-void-color,icon-classes,void-icon-class,disabled-void-icon-class,show-text,show-score,text-color,texts,score-template,change".split(","));
        DOCUMENTATION.put("el-rate","Used for rating");
        TAG_DATA.put("el-color-picker", "disabled,size,show-alpha,color-format,popper-class,change,active-change".split(","));
        DOCUMENTATION.put("el-color-picker",null);
        TAG_DATA.put("el-transfer", "data,filterable,filter-placeholder,filter-method,titles,button-texts,render-content,format,props,left-default-checked,right-default-checked,change".split(","));
        DOCUMENTATION.put("el-transfer",null);
        TAG_DATA.put("el-form", "model,rules,inline,label-position,label-width,label-suffix,show-message,inline-message,status-icon,size".split(","));
        DOCUMENTATION.put("el-form","Form consists of `input`, `radio`, `select`, `checkbox` and so on. With form, you can collect, verify and submit data.");
        TAG_DATA.put("el-form-item", "label,prop,label-width,required,rules,error,show-message,inline-message,size".split(","));
        DOCUMENTATION.put("el-form-item",null);
        TAG_DATA.put("el-table", "data,height,max-height,stripe,border,fit,show-header,highlight-current-row,current-row-key,row-class-name,cell-class-name,cell-style,header-row-class-name,header-row-style,header-cell-name,header-cell-style,row-style,row-key,empty-text,default-expand-all,expand-row-keys,default-sort,tooltip-effect,show-summary,sum-text,summary-method,span-method,select,select-all,selection-change,cell-mouse-enter,cell-mouse-leave,cell-click,cell-dbclick,row-click,row-contextmenu,row-dbclick,header-click,sort-change,filter-change,current-change,header-draggend,expand,expand-change".split(","));
        DOCUMENTATION.put("el-table","Display multiple data with similar format. You can sort, filter, compare your data in a table.");
        TAG_DATA.put("el-table-column", "type,column-key,index,label,prop,width,min-width,fixed,render-header,sortable,sort-method,sort-by,resizable,formatter,show-overflow-tooltip,align,header-align,class-name,label-class-name,selectable,reserve-selection,filters,filter-placement,filter-multiple,filter-method,filtered-value".split(","));
        DOCUMENTATION.put("el-table-column",null);
        TAG_DATA.put("el-tag", "type,closable,close-transition,hit,color,size,close".split(","));
        DOCUMENTATION.put("el-tag","Used for marking and selection.");
        TAG_DATA.put("el-progress", "percentage,type,stroke-width,text-inside,status,width,show-text".split(","));
        DOCUMENTATION.put("el-progress","Progress is used to show the progress of current operation, and inform the user the current status.");
        TAG_DATA.put("el-tree", "data,empty-text,node-key,props,load,render-content,highlight-current,current-node-key,default-expand-all,expand-on-click-node,auto-expand-parent,default-expanded-keys,show-checkbox,check-strictly,default-checked-keys,filter-node-method,accordion,indent,check-descendants,node-click,check-change,current-change,node-expand,node-collapse".split(","));
        DOCUMENTATION.put("el-tree","Display a set of data with hierarchies.");
        TAG_DATA.put("el-pagination", "small,background,page-size,total,page-count,current-page,layout,page-sizes,popper-class,prev-text,next-text,size-change,current-page".split(","));
        DOCUMENTATION.put("el-pagination","If you have too much data to display in one page, use pagination.");
        TAG_DATA.put("el-badge", "value,max,is-dot,hidden".split(","));
        DOCUMENTATION.put("el-badge","A number or status mark on buttons and icons.");
        TAG_DATA.put("el-alert", "title,type,Displays important alert messages.,closable,center,close-text,show-icon,close".split(","));
        DOCUMENTATION.put("el-alert","description");
        TAG_DATA.put("el-menu", "mode,collapse,background-color,text-color,active-text-color,theme,default-active,default-openeds,unique-opened,menu-trigger,router,select,open,close".split(","));
        DOCUMENTATION.put("el-menu",null);
        TAG_DATA.put("el-submenu", "".split(","));
        DOCUMENTATION.put("el-submenu",null);
        TAG_DATA.put("el-menu-item-group", "title".split(","));
        DOCUMENTATION.put("el-menu-item-group",null);
        TAG_DATA.put("el-menu-item", "index,route".split(","));
        DOCUMENTATION.put("el-menu-item",null);
        TAG_DATA.put("el-tabs", "type,closable,addable,editable,value,activate-name,tab-position,tab-click,tab-remove,tab-add,edit".split(","));
        DOCUMENTATION.put("el-tabs","Divide data collections which are related yet belong to different types.");
        TAG_DATA.put("el-tab-pane", "label,disabled,name,closable".split(","));
        DOCUMENTATION.put("el-tab-pane",null);
        TAG_DATA.put("el-breadcrumb", "separator,separator-class".split(","));
        DOCUMENTATION.put("el-breadcrumb","Displays the location of the current page, making it easier to browser back.");
        TAG_DATA.put("el-breadcrumb-item", "to,replace".split(","));
        DOCUMENTATION.put("el-breadcrumb-item",null);
        TAG_DATA.put("el-dropdown", "type,szie,split-button,placement,trigger,hide-on-click,show-timeout,hide-timeout,click,command,visible-change".split(","));
        DOCUMENTATION.put("el-dropdown","Toggleable menu for displaying lists of links and actions.");
        TAG_DATA.put("el-dropdown-menu", "command,disabled,divided".split(","));
        DOCUMENTATION.put("el-dropdown-menu",null);
        TAG_DATA.put("el-steps", "space,direction,active,process-status,finish-status,align-center,center,simple".split(","));
        DOCUMENTATION.put("el-steps","Guide the user to complete tasks in accordance with the process. Its steps can be set according to the actual application scenario and the number of the steps can't be less than 2.");
        TAG_DATA.put("el-step", "title,no doc,icon,status".split(","));
        DOCUMENTATION.put("el-step","description");
        TAG_DATA.put("el-dialog", "title,top,visible,width,fullscreen,modal,modal-append-to-body,append-to-body,lock-scroll,custom-class,close-on-click-modal,show-close,before-close,center,close,open".split(","));
        DOCUMENTATION.put("el-dialog","Informs users while preserving the current page state.");
        TAG_DATA.put("el-tooltip", "effect,content,placement,value,disabled,offset,transition,visible-arrow,popper-options,open-delay,manual,popper-class,enterable,hide-after".split(","));
        DOCUMENTATION.put("el-tooltip","Display prompt information for mouse hover.");
        TAG_DATA.put("el-popover", "trigger,title,content,width,placement,disabled,value,offset,transition,visible-arrow,popper-options,popper-class,show,hide,open-delay".split(","));
        DOCUMENTATION.put("el-popover",null);
        TAG_DATA.put("el-card", "header,body-style".split(","));
        DOCUMENTATION.put("el-card","Integrate information in a card container.");
        TAG_DATA.put("el-carousel", "height,initial-index,trigger,autoplay,interval,indicator-position,arrow,type,change".split(","));
        DOCUMENTATION.put("el-carousel","Loop a series of images or texts in a limited space");
        TAG_DATA.put("el-carousel-item", "name,label".split(","));
        DOCUMENTATION.put("el-carousel-item",null);
        TAG_DATA.put("el-collapse", "accordion,value,change".split(","));
        DOCUMENTATION.put("el-collapse","Use Collapse to store contents.");
        TAG_DATA.put("el-collapse-item", "name,title".split(","));
        DOCUMENTATION.put("el-collapse-item",null);
        
        //attribute 
        DOCUMENTATION.put("gutter","grid spacing");
        DOCUMENTATION.put("justify","horizontal alignment of flex layout");
        DOCUMENTATION.put("tag","custom element tag");
        DOCUMENTATION.put("span","number of column the grid spans");
        DOCUMENTATION.put("push","number of columns that grid moves to the right");
        DOCUMENTATION.put("pull","number of columns that grid moves to the left");
        DOCUMENTATION.put("xs","<768px Responsive columns or column props object");
        DOCUMENTATION.put("sm","≥768px Responsive columns or column props object");
        DOCUMENTATION.put("md","≥992 Responsive columns or column props object");
        DOCUMENTATION.put("lg","≥1200 Responsive columns or column props object");
        DOCUMENTATION.put("xl","≥1200px Responsive columns or column props object, version >= 2");
        DOCUMENTATION.put("native-type","same as native button's type");
        DOCUMENTATION.put("name","native 'name' attribute");
        DOCUMENTATION.put("fill","border and background color when button is active");
        DOCUMENTATION.put("true-label","value of the checkbox if it's checked");
        DOCUMENTATION.put("false-label","value of the checkbox if it's not checked");
        DOCUMENTATION.put("size",null);
        DOCUMENTATION.put("maxlength","maximum Input text length");
        DOCUMENTATION.put("minlength","minimum Input text length");
        DOCUMENTATION.put("rows","number of rows of textarea, only works when type is 'textarea'");
        DOCUMENTATION.put("autosize","whether textarea has an adaptive height, only works when type is 'textarea'. Can accept an object, e.g. { minRows: 2, maxRows: 6 }");
        DOCUMENTATION.put("auto-complete",null);
        DOCUMENTATION.put("form","same as 'form' in native input");
        DOCUMENTATION.put("custom-item","component name of your customized suggestion list item");
        DOCUMENTATION.put("fetch-suggestions","a method to fetch input suggestions. When suggestions are ready, invoke callback(data:[]) to return them to Autocomplete");
        DOCUMENTATION.put("trigger-on-focus","whether show suggestions when input focus");
        DOCUMENTATION.put("on-icon-click","hook function when clicking on the input icon");
        DOCUMENTATION.put("debounce","debounce delay when typing, in millisecond");
        DOCUMENTATION.put("multiple-limit","maximum number of options user can select when multiple is true. No limit when set to 0");
        DOCUMENTATION.put("loading-text","displayed text while loading data from server");
        DOCUMENTATION.put("no-match-text","displayed text when no data matches the filtering query");
        DOCUMENTATION.put("no-data-text","displayed text when there is no options");
        DOCUMENTATION.put("expand-trigger","trigger mode of expanding current item");
        DOCUMENTATION.put("show-all-levels","whether to display all levels of the selected value in the input");
        DOCUMENTATION.put("theme","theme color, default: light");
        DOCUMENTATION.put("on-text","text displayed when in on state, version < 2");
        DOCUMENTATION.put("off-text","text displayed when in off state, version < 2");
        DOCUMENTATION.put("on-value","switch value when in on state, default: true, version < 2");
        DOCUMENTATION.put("off-value","switch value when in off state, default: false, version < 2");
        DOCUMENTATION.put("on-color","background color when in on state, default: #20A0FF, version < 2");
        DOCUMENTATION.put("off-color","background color when in off state, default: #C0CCDA, version < 2");
        DOCUMENTATION.put("active-text","text displayed when in on state, version >= 2");
        DOCUMENTATION.put("inactive-text","text displayed when in off state, version >= 2");
        DOCUMENTATION.put("active-value","switch value when in on state, default: true, version >= 2");
        DOCUMENTATION.put("inactive-value","switch value when in off state, default: false, version >= 2");
        DOCUMENTATION.put("active-color","background color when in on state, default: #409EFF, version >= 2");
        DOCUMENTATION.put("inactive-color","background color when in off state, default: #C0CCDA, version >= 2");
        DOCUMENTATION.put("controls-position","position of the control buttons");
        DOCUMENTATION.put("tabindex","input tabindex");
        DOCUMENTATION.put("format","year yyyy month MM day dd, hour HH, minute mm, second ss, default: yyyy-MM-dd");
        DOCUMENTATION.put("range-separator","default: '-'");
        DOCUMENTATION.put("default-value","optional default time of the picker, type: Date");
        DOCUMENTATION.put("action","required, upload URL");
        DOCUMENTATION.put("headers","request headers");
        DOCUMENTATION.put("accept","accepted file types, will not work when thumbnail-mode is true");
        DOCUMENTATION.put("on-preview","hook function when clicking the uploaded files, type: function(file)");
        DOCUMENTATION.put("on-remove","hook function when files are removed, type: function(file, fileList)");
        DOCUMENTATION.put("on-success","hook function when uploaded successfully, type: function(response, file, fileList)");
        DOCUMENTATION.put("on-error","hook function when some errors occurs, type: function(err, file, fileList)");
        DOCUMENTATION.put("on-progress","hook function when some progress occurs, type: function(event, file, fileList)");
        DOCUMENTATION.put("on-change","hook function when select file or upload file success or upload file fail, type: function(file, fileList)");
        DOCUMENTATION.put("before-upload","hook function before uploading with the file to be uploaded as its parameter. If false is returned or a Promise is returned and then is rejected, uploading will be aborted, type: function(file)");
        DOCUMENTATION.put("before-remove","hook function before removing a file with the file and file list as its parameters. If false is returned or a Promise is returned and then is rejected, removing will be aborted. type: function(file, fileList)");
        DOCUMENTATION.put("file-list","default uploaded files, e.g. [{name: '*.jpeg', url: '*'}]");
        DOCUMENTATION.put("list-type","type of fileList, default: 'text'");
        DOCUMENTATION.put("http-request","override default xhr behavior, allowing you to implement your own upload-file's request");
        DOCUMENTATION.put("low-threshold","hreshold value between low and medium level. The value itself will be included in low level, default: 2");
        DOCUMENTATION.put("high-threshold","threshold value between medium and high level. The value itself will be included in high level, default: 4");
        DOCUMENTATION.put("colors","color array for icons. It should have 3 elements, each of which corresponds with a score level, default: ['#F7BA2A', '#F7BA2A', '#F7BA2A']");
        DOCUMENTATION.put("void-color","color of unselected icons, default: #C6D1DE");
        DOCUMENTATION.put("disabled-void-color","color of unselected read-only icons, default: #EFF2F7");
        DOCUMENTATION.put("texts","text array");
        DOCUMENTATION.put("text-template","text template when the component is read-only, default: {value}");
        DOCUMENTATION.put("score-template","score template, default: {value}");
        DOCUMENTATION.put("color-format","color format of v-model, default: hex(when show-alpha is false)/rgb(when show-alpha is true)");
        DOCUMENTATION.put("titles","custom list titles, default: ['List 1', 'List 2']");
        DOCUMENTATION.put("button-texts","custom button texts, default: []");
        DOCUMENTATION.put("render-content","custom render function for data items");
        DOCUMENTATION.put("left-default-checked","key array of initially checked data items of the left list, default: []");
        DOCUMENTATION.put("right-default-checked","key array of initially checked data items of the right list, default: []");
        DOCUMENTATION.put("model","data of form component, type: object");
        DOCUMENTATION.put("rules","validation rules of form");
        DOCUMENTATION.put("label-position","position of label, default: 'right'");
        DOCUMENTATION.put("error","field error message, set its value and the field will validate error and show this message immediately");
        DOCUMENTATION.put("current-row-key","key of current row, a set only prop");
        DOCUMENTATION.put("row-class-name","function that returns custom class names for a row, or a string assigning class names for every row");
        DOCUMENTATION.put("prev-text","text for the prev button");
        DOCUMENTATION.put("next-text","text for the next button");
        DOCUMENTATION.put("header-row-class-name","function that returns custom class names for a row in table header, or a string assigning class names for every row in table header");
        DOCUMENTATION.put("header-row-style","function that returns custom style for a row in table header, or an object assigning custom style for every row in table header");
        DOCUMENTATION.put("header-cell-class-name","function that returns custom class names for a cell in table header, or a string assigning class names for every cell in table header");
        DOCUMENTATION.put("header-cell-style","function that returns custom style for a cell in table header, or an object assigning custom style for every cell in table header");
        DOCUMENTATION.put("cell-class-name","function that returns custom class names for a cell, or a string assigning class names for every cell");
        DOCUMENTATION.put("cell-style","function that returns custom style for a cell, or an object assigning custom style for every cell");
        DOCUMENTATION.put("row-style","function that returns custom style for a row, or a string assigning custom style for every row");
        DOCUMENTATION.put("row-key","key of row data, used for optimizing rendering. Required if 'reserve-selection' is on");
        DOCUMENTATION.put("expand-row-keys","set expanded rows by this prop, prop's value is the keys of expand rows, you should set row-key before using this prop, type: Array");
        DOCUMENTATION.put("default-sort","set the default sort column and order. property prop is used to set default sort column, property order is used to set default sort order");
        DOCUMENTATION.put("tooltip-effect","tooltip 'effect' property");
        DOCUMENTATION.put("sum-text","displayed text for the first column of summary row, default: Sum");
        DOCUMENTATION.put("summary-method","custom summary method");
        DOCUMENTATION.put("span-method","method that returns rowspan and colspan");
        DOCUMENTATION.put("column-key","column's key. If you need to use the filter-change event, you need this attribute to identify which column is being filtered");
        DOCUMENTATION.put("fixed","whether column is fixed at left/right. Will be fixed at left if 'true'");
        DOCUMENTATION.put("render-header","render function for table header of this column");
        DOCUMENTATION.put("sort-method","sorting method, works when 'sortable' is true. Should return a number, just like Array.sort, type: Function(a, b)");
        DOCUMENTATION.put("sort-by","specify which property to sort by, works when 'sortable' is true and 'sort-method' is undefined. If set to an Array, the column will sequentially sort by the next property if the previous one is equal, type: Function(row, index)/String/Array");
        DOCUMENTATION.put("formatter","function that formats content");
        DOCUMENTATION.put("align",null);
        DOCUMENTATION.put("header-align","alignment of the table header. If omitted, the value of the 'align' attribute will be applied");
        DOCUMENTATION.put("label-class-name","class name of the label of this column");
        DOCUMENTATION.put("selectable","function that determines if a certain row can be selected, works when type is 'selection' Function(row, index)");
        DOCUMENTATION.put("filters","an array of data filtering options. For each element in this array, 'text' and 'value' are required");
        DOCUMENTATION.put("filter-placement","placement for the filter dropdown");
        DOCUMENTATION.put("filtered-value","filter value for selected data, might be useful when table header is rendered with 'render-header'");
        DOCUMENTATION.put("percentage","percentage, required, default: 0");
        DOCUMENTATION.put("stroke-width","the width of progress bar, default: 6");
        DOCUMENTATION.put("node-key","unique identity key name for nodes, its value should be unique across the whole tree");
        DOCUMENTATION.put("load","method for loading subtree data");
        DOCUMENTATION.put("current-node-key","key of current node, a set only prop");
        DOCUMENTATION.put("default-expanded-keys","array of keys of initially expanded nodes");
        DOCUMENTATION.put("default-checked-keys","array of keys of initially checked nodes");
        DOCUMENTATION.put("filter-node-method","this function will be executed on each node when use filter method. if return 'false', tree node will be hidden.");
        DOCUMENTATION.put("indent","horizontal indentation of nodes in adjacent levels in pixels, default: 16");
        DOCUMENTATION.put("page-size","item count of each page, default: 10");
        DOCUMENTATION.put("total","total item count");
        DOCUMENTATION.put("page-count","total page count. Set either 'total' or 'page-count' and pages will be displayed; if you need 'page-sizes', total is required");
        DOCUMENTATION.put("current-page","current page number, supports the .sync modifier, default: 1");
        DOCUMENTATION.put("layout","layout of Pagination, elements separated with a comma");
        DOCUMENTATION.put("page-sizes","options of item count per page, example: [10, 20]");
        DOCUMENTATION.put("close-text","customized close button text");
        DOCUMENTATION.put("default-openeds","array that contains keys of currently active sub-menus");
        DOCUMENTATION.put("default-active","index of currently active menu");
        DOCUMENTATION.put("menu-trigger","how sub-menus are triggered, only works when mode is 'horizontal', default: hover");
        DOCUMENTATION.put("route","Vue Router object");
        DOCUMENTATION.put("activate-name","name of the selected tab(deprecated)");
        DOCUMENTATION.put("separator","separator character, default: '/'");
        DOCUMENTATION.put("to","target route of the link, same as to of vue-router");
        DOCUMENTATION.put("command","a command to be dispatched to Dropdown's 'command' callback");
        DOCUMENTATION.put("space","the spacing of each step, will be responsive if omitted. Support percentage.");
        DOCUMENTATION.put("direction","display direction, default: horizontal");
        DOCUMENTATION.put("active","current activation step");
        DOCUMENTATION.put("process-status","status of current step, default: process");
        DOCUMENTATION.put("finish-status","status of end step, default: finish");
        DOCUMENTATION.put("top","value for top of Dialog CSS, works when size is not full, default: 15%");
        DOCUMENTATION.put("custom-class","custom class names for Dialog");
        DOCUMENTATION.put("before-close","callback before Dialog closes, and it will prevent Dialog from closing");
        DOCUMENTATION.put("effect","Tooltip theme");
        DOCUMENTATION.put("transition","animation name, default: 'el-fade-in-linear'");
        DOCUMENTATION.put("header","Title of the card. Also accepts a DOM passed by slot#header");
        DOCUMENTATION.put("body-style","CSS style of body,type: object, default: {padding: '20px'}");
        DOCUMENTATION.put("initial-index","index of the initially active slide (starting from 0), default: 0");
        DOCUMENTATION.put("interval","interval of the auto loop, in milliseconds, default: 30000");
        DOCUMENTATION.put("indicator-position","position of the indicators");
        DOCUMENTATION.put("arrow","when arrows are shown, default: hover");
        DOCUMENTATION.put("menu-algin","horizontal alignment, default: end");
        DOCUMENTATION.put("placement","default: bottom");
        DOCUMENTATION.put("value-key","unique identity key name for value, required when value is an object");
        DOCUMENTATION.put("hide-after","timeout in milliseconds to hide tooltip, default: 0");
        DOCUMENTATION.put("separator-class","iconfont-separator's class");
        DOCUMENTATION.put("start-placeholder","placeholder for the start time in range mode");
        DOCUMENTATION.put("end-placeholder","placeholder for the end time in range mode");
        DOCUMENTATION.put("value-format","optional, format of binding value. If not specified, the binding value will be a Date object");
        DOCUMENTATION.put("tab-position","position of tabs, default: top");
        DOCUMENTATION.put("on-exceed","hook function when limit is exceeded");
        DOCUMENTATION.put("show-timeout","Delay time before show a dropdown, default: 250");
        DOCUMENTATION.put("hide-timeout","Delay time before hide a dropdown, default: 150");
        DOCUMENTATION.put("el-input/on-icon-click","hook function when clicking on the input icon");
        DOCUMENTATION.put("el-upload/limit","maximum number of uploads allowed");
        DOCUMENTATION.put("el-transfer/footer-format","texts for checking status in list footer");
        DOCUMENTATION.put("el-transfer/format","texts for checking status in list footer, default: { noChecked: '${total} items', hasChecked: '${checked}/${total} checked' }");
        DOCUMENTATION.put("el-dropdown/palcement","placement of pop menu, default: 'bottom-end");
        DOCUMENTATION.put("el-menu/background-color","background color of Menu (hex format), default: #ffffff");
        DOCUMENTATION.put("el-menu/text-color","text color of Menu (hex format), default: #2d2f33");
        DOCUMENTATION.put("el-menu/active-text-color","text color of currently active menu item (hex format), default: #409EFF");
        DOCUMENTATION.put("el-tooltip/content","display content, can be overridden by slot#content");
        DOCUMENTATION.put("el-popover/content","popover content, can be replaced with a default slot");
        DOCUMENTATION.put("el-dropdown/trigger","default: hover");
        DOCUMENTATION.put("el-carousel/trigger","default: hover");
        DOCUMENTATION.put("el-popover/trigger","how the popover is triggered, default: click");
        DOCUMENTATION.put("el-tabs/name","identifier corresponding to the activeName of Tabs, representing the alias of the tab-pane");
        DOCUMENTATION.put("el-tabs/index","name of the selected tab");
        DOCUMENTATION.put("el-menu/model","menu display mode");
        DOCUMENTATION.put("el-tree/render-content","render function for tree node");
        DOCUMENTATION.put("el-step/status","current status. It will be automatically set by Steps if not configured.");
        DOCUMENTATION.put("el-progress/status","the current status of progress bar");
        DOCUMENTATION.put("el-table-column/min-width","column minimum width. Columns with width has a fixed width, while columns with min-width has a width that is distributed in proportion");
        DOCUMENTATION.put("el-table/empty-text","Displayed text when data is empty. You can customize this area with slot='empty'");
        DOCUMENTATION.put("el-tree/empty-text","text displayed when data is void");
        DOCUMENTATION.put("el-form-item/prop","a key of model. In the use of validate and resetFields method, the attribute is required");
        DOCUMENTATION.put("el-table-column/prop","field name. You can also use its alias: property");
        DOCUMENTATION.put("el-row/align","vertical alignment of flex layout");
        DOCUMENTATION.put("el-row/offset","number of spacing on the left side of the grid");
        DOCUMENTATION.put("el-tooltip/offset","offset of the Tooltip, default: 0");
        DOCUMENTATION.put("el-carousel-item/name","name of the item, can be used in 'setActiveItem'");
        DOCUMENTATION.put("el-collapse/name","unique identification of the panel");
        DOCUMENTATION.put("el-switch/name","input name of Switch");
        DOCUMENTATION.put("el-upload/name","key name for uploaded file, default: 'file'");
        DOCUMENTATION.put("el-input/resize","control the resizability");
        DOCUMENTATION.put("el-input/step","same as step in native input");
        DOCUMENTATION.put("el-input-number/step","incremental step");
        DOCUMENTATION.put("el-switch/step","step size, default: 1");
        DOCUMENTATION.put("el-carousel/type","type of the Carousel");
        DOCUMENTATION.put("el-dropdown/type","menu button type, refer to Button Component, only works when 'split-button' is true");
        DOCUMENTATION.put("el-tabs/type","type of Tab");
        DOCUMENTATION.put("el-progress/type","the type of progress bar, default: line");
        DOCUMENTATION.put("el-row/type","layout mode, you can use 'flex', works in modern browsers");
        DOCUMENTATION.put("el-input/type","Same as the 'type' attribute of native input, except that it can be 'textarea'");
        DOCUMENTATION.put("el-button/type","button type");
        DOCUMENTATION.put("el-date-picker/type","type of the picker, default: date");
        DOCUMENTATION.put("el-table-column/type","type of the column. If set to 'selection', the column will display checkbox. If set to 'index', the column will display index of the row (staring from 1). If set to 'expand', the column will display expand icon.");
        DOCUMENTATION.put("el-tag/type","theme");
        DOCUMENTATION.put("el-alert/type","component type");
        DOCUMENTATION.put("el-checkbox-group/min","minimum number of checkbox checked");
        DOCUMENTATION.put("el-input-number/min","the minimum allowed value");
        DOCUMENTATION.put("el-slider/min","minimum value, defalult: 0");
        DOCUMENTATION.put("el-slider/max","maximum value, defalult: 100");
        DOCUMENTATION.put("el-slider/debounce","debounce delay when typing, in millisecond, works when 'show-input' is true, default: 300");
        DOCUMENTATION.put("el-autocomplete/debounce",null);
        DOCUMENTATION.put("el-rate/max","max rating score, default: 5");
        DOCUMENTATION.put("el-badge/max","maximum value, shows '{max}+' when exceeded. Only works if 'value' is a Number");
        DOCUMENTATION.put("el-checkbox-group/max","maximum number of checkbox checked");
        DOCUMENTATION.put("el-input-number/max","the maximum allowed value");
        DOCUMENTATION.put("el-slider/height","Slider height, required in vertical mode");
        DOCUMENTATION.put("el-table/height","Table's height. By default it has an auto height. If its value is a number, the height is measured in pixels; if its value is a string, the height is affected by external styles");
        DOCUMENTATION.put("el-table/max-height","Table's max-height. The height of the table starts from 'auto' until it reaches the maxHeight limit. The 'maxHeight' is measured in pixels, same as 'heigh't");
        DOCUMENTATION.put("el-time-select/value","value of the picker, default: HH:mm:ss");
        DOCUMENTATION.put("el-tooltip/open-delay","delay of appearance, in millisecond, default: 0");
        DOCUMENTATION.put("el-popover/open-delay","delay of appearance when trigger is hover, in milliseconds");
        DOCUMENTATION.put("el-time-select/picker-options","additional options, type is object");
        DOCUMENTATION.put("el-time-picker/picker-options","additional options, type is object");
        DOCUMENTATION.put("el-date-picker/picker-options","additional options, type is object");
        DOCUMENTATION.put("loading",null);
        DOCUMENTATION.put("disabled",null);
        DOCUMENTATION.put("autofocus",null);
        DOCUMENTATION.put("checked",null);
        DOCUMENTATION.put("controls",null);
        DOCUMENTATION.put("remote",null);
        DOCUMENTATION.put("auto-upload",null);
        DOCUMENTATION.put("show-message",null);
        DOCUMENTATION.put("hidden",null);
        DOCUMENTATION.put("visible-arrow",null);
        DOCUMENTATION.put("fullscreen","whether the Dialog takes up full screen, default: false");
        DOCUMENTATION.put("autoplay","whether automatically loop the slides, default: true");
        DOCUMENTATION.put("enterable","enterable whether the mouse can enter the tooltip, default: true");
        DOCUMENTATION.put("show-close","whether to show a close button, default: true");
        DOCUMENTATION.put("close-on-press-escape","whether the Dialog can be closed by pressing ESC, default: true");
        DOCUMENTATION.put("close-on-click-modal","whether the Dialog can be closed by clicking the mask, default: true");
        DOCUMENTATION.put("lock-scroll","whether scroll of body is disabled while Dialog is displayed, default: true");
        DOCUMENTATION.put("modal-append-to-body","whether to append modal to body element. If false, the modal will be appended to Dialog's parent element, default: true");
        DOCUMENTATION.put("append-to-body","whether to append Dialog itself to body. A nested Dialog should have this attribute set to 'true', default: false");
        DOCUMENTATION.put("modal","whether a mask is displayed, default: true");
        DOCUMENTATION.put("visible","visibility of Dialog, supports the '.sync' modifier, default: false");
        DOCUMENTATION.put("hide-on-click","whether to hide menu after clicking menu-item");
        DOCUMENTATION.put("split-button","whether a button group is displayed");
        DOCUMENTATION.put("replace","if 'true', the navigation will not leave a history record, default: false");
        DOCUMENTATION.put("auto-expand-parent","whether to expand father node when a child node is expanded, default: true");
        DOCUMENTATION.put("expand-on-click-node","whether to expand or collapse node when clicking on the node, if false, then expand or collapse node only when clicking on the arrow icon, default: true");
        DOCUMENTATION.put("filter-multiple","whether data filtering supports multiple options");
        DOCUMENTATION.put("shwo-header","whether table header is visible");
        DOCUMENTATION.put("fit","whether width of column automatically fits its container");
        DOCUMENTATION.put("inline","whether the form is inline");
        DOCUMENTATION.put("indeterminate","same as indeterminate in native checkbox");
        DOCUMENTATION.put("plain","determine whether it's a plain button");
        DOCUMENTATION.put("allow-half","whether picking half start is allowed");
        DOCUMENTATION.put("thumbnail-mode","whether thumbnail is displayed, default: false");
        DOCUMENTATION.put("show-upload-list","whether to show the uploaded file list, default: true");
        DOCUMENTATION.put("vertical","defaults: false");
        DOCUMENTATION.put("collapse","whether the menu is collapsed (available only in vertical mode)");
        DOCUMENTATION.put("el-tooltip/vavlue","visibility of Tooltip, default: false");
        DOCUMENTATION.put("el-collapse/accordion","whether to activate accordion mode, default: false");
        DOCUMENTATION.put("el-tree/accordion","whether only one node among the same level can be expanded at one time, default: false");
        DOCUMENTATION.put("el-button/round",null);
        DOCUMENTATION.put("change",null);
        DOCUMENTATION.put("select",null);
        DOCUMENTATION.put("click",null);
        DOCUMENTATION.put("blur",null);
        DOCUMENTATION.put("focus",null);
        DOCUMENTATION.put("method",null);
        DOCUMENTATION.put("visible-change",null);
        DOCUMENTATION.put("remove-tag",null);
        DOCUMENTATION.put("szie-change",null);
        DOCUMENTATION.put("close",null);
        DOCUMENTATION.put("open",null);
        DOCUMENTATION.put("active-change",null);
        DOCUMENTATION.put("el-input/click",null);
        DOCUMENTATION.put("el-menu/open",null);
        DOCUMENTATION.put("el-menu/close",null);
        DOCUMENTATION.put("show","triggers when popover shows");
        DOCUMENTATION.put("hide","triggers when popover hides");
        DOCUMENTATION.put("tab-click","triggers when a tab is clicked");
        DOCUMENTATION.put("tab-remove","triggers when tab-remove button is clicked");
        DOCUMENTATION.put("tab-add","triggers when tab-add button is clicked");
        DOCUMENTATION.put("edit","triggers when tab-add button or tab-remove is clicked");
        DOCUMENTATION.put("node-expand","triggers when current node open");
        DOCUMENTATION.put("node-collapse","triggers when current node close");
        DOCUMENTATION.put("node-click","triggers when a node is clicked");
        DOCUMENTATION.put("check-change","triggers when the selected state of the node changes");
        DOCUMENTATION.put("active-item-change","triggers when active option changes, only works when 'change-on-select' is 'false'");
        DOCUMENTATION.put("select-all","triggers when user clicks the checkbox in table header, arg: selection");
        DOCUMENTATION.put("selection-change","triggers when selection changes, arg: selection");
        DOCUMENTATION.put("cell-mouse-enter","triggers when hovering into a cell, arg: row, column, cell, event");
        DOCUMENTATION.put("cell-mouse-leave","triggers when hovering out of a cell, arg: row column, cell, event");
        DOCUMENTATION.put("cell-click","triggers when clicking a cell, arg: row, column, cell, event");
        DOCUMENTATION.put("cell-dbclick","triggers when double clicking a cell, arg: row, column, cell, event");
        DOCUMENTATION.put("row-click","triggers when clicking a row, arg: row, event, column");
        DOCUMENTATION.put("row-contextmenu","triggers when user right clicks on a row, arg: row, event");
        DOCUMENTATION.put("row-dbclick","triggers when double clicking a row, arg: row, event");
        DOCUMENTATION.put("header-click","triggers when clicking a column header, arg: column, event");
        DOCUMENTATION.put("sort-change","triggers when Table's sorting changes, arg: { column, prop, order }");
        DOCUMENTATION.put("filter-change","column's key. If you need to use the filter-change event, this attribute is mandatory to identify which column is being filtered, arg: filters");
        DOCUMENTATION.put("current-change","triggers when current row changes, arg: currentRow, oldCurrentRow");
        DOCUMENTATION.put("header-draggend","triggers when finish dragging header, arg: newWidth, oldWidth, column, event");
        DOCUMENTATION.put("expand","triggers when user expands or collapses a row, arg: row, expanded");
        DOCUMENTATION.put("expand-change","triggers when user expands or collapses a row, arg: row, expanded");
        DOCUMENTATION.put("el-table/select","triggers when user clicks the checkbox in a row, arg: selection, row");
        DOCUMENTATION.put("el-tag/close","triggers when Tab is removed");
        DOCUMENTATION.put("el-tree/current-change","triggers when current node changes");
        DOCUMENTATION.put("el-pagination/current-change","triggers when 'current-page' changes");
        DOCUMENTATION.put("el-dropdown/command","triggers when a dropdown item is clicked");
        DOCUMENTATION.put("readonly",null);
        DOCUMENTATION.put("multiple",null);
        DOCUMENTATION.put("clearable",null);
        DOCUMENTATION.put("filterable",null);
        DOCUMENTATION.put("editable",null);
        DOCUMENTATION.put("allow-create",null);
        DOCUMENTATION.put("required",null);
        DOCUMENTATION.put("show-text",null);
        DOCUMENTATION.put("stripe",null);
        DOCUMENTATION.put("border",null);
        DOCUMENTATION.put("show-summary",null);
        DOCUMENTATION.put("default-expand-all",null);
        DOCUMENTATION.put("highlight-current-row",null);
        DOCUMENTATION.put("highlight-current",null);
        DOCUMENTATION.put("sortable",null);
        DOCUMENTATION.put("closable",null);
        DOCUMENTATION.put("small",null);
        DOCUMENTATION.put("divided",null);
        DOCUMENTATION.put("simple",null);
        DOCUMENTATION.put("el-radio/border",null);
        DOCUMENTATION.put("el-checkbox/border",null);
        DOCUMENTATION.put("unlink-panels","unlink two date-panels in range-picker");
        DOCUMENTATION.put("reserve-keyword","when 'multiple' and 'filter' is true, whether to reserve current keyword after selecting an option");
        DOCUMENTATION.put("default-first-option","select first matching option on enter key. Use with 'filterable' or 'remote'");
        DOCUMENTATION.put("arrow-control","whether to pick time using arrow buttons, only works with <el-time-picker>");
        DOCUMENTATION.put("time-arrow-control","whether to pick time using arrow buttons");
        DOCUMENTATION.put("status-icon",null);
        DOCUMENTATION.put("select-when-unmatched","whether to emit a 'select' event on enter when there is no autocomplete match");
        DOCUMENTATION.put("manual","whether to control Tooltip manually. mouseenter and mouseleave won't have effects if set to 'true', default: false");
        DOCUMENTATION.put("align-center","whether step description is centered");
        DOCUMENTATION.put("center","center whole Steps component");
        DOCUMENTATION.put("router","whether vue-router mode is activated. If true, index will be used as 'path' to activate the route action");
        DOCUMENTATION.put("unique-opened","whether only one sub-menu can be active");
        DOCUMENTATION.put("show-icon","if a type icon is displayed");
        DOCUMENTATION.put("is-dot","a little dot is displayed");
        DOCUMENTATION.put("check-strictly","whether checked state of a node not affects its father and child nodes when 'show-checkbox' is 'true'");
        DOCUMENTATION.put("show-checkbox","whether node is selectable");
        DOCUMENTATION.put("text-inside","whether to place the percentage inside progress bar, only works when type is 'line'");
        DOCUMENTATION.put("hit","whether Tag has a highlighted border");
        DOCUMENTATION.put("close-transition","whether the removal animation is disabled");
        DOCUMENTATION.put("reserve-selection","whether to reserve selection after data refreshing, works when type is 'selection'");
        DOCUMENTATION.put("show-overflow-tooltip","whether to hide extra content and show them in a tooltip when hovering on the cell");
        DOCUMENTATION.put("resizable","whether column width can be resized, works when border of 'el-table' is 'true'");
        DOCUMENTATION.put("show-alpha","whether to display the alpha slider");
        DOCUMENTATION.put("drag","whether to activate drag and drop mode");
        DOCUMENTATION.put("with-credentials","whether cookies are sent");
        DOCUMENTATION.put("change-on-select","whether selecting an option of any level is permitted");
        DOCUMENTATION.put("show-input","whether to display an input box, works when 'range' is false, default: false");
        DOCUMENTATION.put("show-input-controls","whether to display control buttons when 'show-input' is true, default: true");
        DOCUMENTATION.put("show-stops","whether to display breakpoints, default: false");
        DOCUMENTATION.put("show-tooltip","whether to display tooltip value, default: true");
        DOCUMENTATION.put("range","whether to select a range");
        DOCUMENTATION.put("show-score","whether to display current score. show-score and show-text cannot be true at the same time");
        DOCUMENTATION.put("background","whether the buttons have a background color");
        DOCUMENTATION.put("collapse-tags","whether to collapse tags to a text when multiple selecting");
        DOCUMENTATION.put("el-dialog/center","whether to align the header and footer in center");
        DOCUMENTATION.put("el-alert/center","whether to center the text");
        DOCUMENTATION.put("e;-steps/center","center whole 'Steps' component");
        DOCUMENTATION.put("el-form/inline-message","whether to display the error message inline with the form item");
        DOCUMENTATION.put("el-form-item/inline-message","inline style validate message");
        DOCUMENTATION.put("format-tooltip",null);
        DOCUMENTATION.put("filter-method",null);
        DOCUMENTATION.put("remote-method",null);
        DOCUMENTATION.put("label",null);
        DOCUMENTATION.put("placeholder",null);
        DOCUMENTATION.put("max",null);
        DOCUMENTATION.put("min",null);
        DOCUMENTATION.put("popper-class",null);
        DOCUMENTATION.put("el-color-picker/popper-class",null);
        DOCUMENTATION.put("options",null);
        DOCUMENTATION.put("props",null);
        DOCUMENTATION.put("el-autocomplete/props",null);
        DOCUMENTATION.put("value",null);
        DOCUMENTATION.put("width",null);
        DOCUMENTATION.put("height",null);
        DOCUMENTATION.put("data",null);
        DOCUMENTATION.put("index",null);
        DOCUMENTATION.put("text-color",null);
        DOCUMENTATION.put("filter-placeholder",null);
        DOCUMENTATION.put("label-width",null);
        DOCUMENTATION.put("label-suffix",null);
        DOCUMENTATION.put("class-name",null);
        DOCUMENTATION.put("color",null);
        DOCUMENTATION.put("title",null);
        DOCUMENTATION.put(null,"description");
        DOCUMENTATION.put("popper-options",null);
        DOCUMENTATION.put("check-descendants",null);
        DOCUMENTATION.put("v-loading",null);
        DOCUMENTATION.put("element-loading-text",null);
        DOCUMENTATION.put("class",null);
        DOCUMENTATION.put("void-icon-class","class name of unselected icons, default: el-icon-star-off");
        DOCUMENTATION.put("disabled-void-icon-class","class name of unselected read-only icons, default: el-icon-star-on");
        DOCUMENTATION.put("icon-classes","array of class names of icons. It should have 3 elements, each of which corresponds with a score level, default: ['el-icon-star-on', 'el-icon-star-on','el-icon-star-on']");
        DOCUMENTATION.put("on-icon-class","class name of the icon displayed when in on state, overrides 'on-text', version < 2");
        DOCUMENTATION.put("off-icon-class","class name of the icon displayed when in off state, overrides 'off-text', version < 2");
        DOCUMENTATION.put("active-icon-class","class name of the icon displayed when in on state, overrides 'active-text', version >= 2");
        DOCUMENTATION.put("inactive-icon-class","class name of the icon displayed when in off state, overrides 'inactive-text', version >= 2");
        DOCUMENTATION.put("prefix-icon","prefix icon class");
        DOCUMENTATION.put("suffix-icon","suffix icon class");
        DOCUMENTATION.put("icon",null);
        DOCUMENTATION.put("el-input/icon","icon name");
        DOCUMENTATION.put("icons",null);

    }
//    static{
//        JSONParser parser= new JSONParser();
//        try {
//             String usrHome = System.getProperty("user.home");
//             File configPath = new File(usrHome+File.separatorChar+".netbeans"+File.separatorChar+"vue");
//             if(configPath.exists() && configPath.isDirectory()){
//                 //存在目录遍历文件
//                 File[] configFiles = configPath.listFiles();
//                 for(File file:configFiles){
//                     if(file.getName().toLowerCase().endsWith(".json") && file.canRead()){
//                          Map<String,Map> data = (Map<String,Map>)parser.parse(new FileReader(file));
//                          for(String key:data.keySet()){
//                              Map map2 = data.get(key);
//                              if(map2!=null && map2.containsKey("attributes")){
//                                //标签
//                                tagAttributeData.put(key, (String[])map2.get("attributes"));
//                              }
//                              if(map2!=null && map2.containsKey("description")){
//                                DOCUMENTATION.put(key, String.valueOf(map2.get("description")));
//                              }
//                          }
//                     }
//                 }
//                
//             }else{
//                 //不存在,创建目录
//                 configPath.mkdirs();
//             }
//        } catch (FileNotFoundException ex) {
//            Exceptions.printStackTrace(ex);
//        } catch (IOException | ParseException ex) {
//            Exceptions.printStackTrace(ex);
//        }
//        for(String key:tagAttributeData.keySet()){
//            System.out.println("tag key:");
//            System.out.println("tag desc:"+DOCUMENTATION.get(key));
//            System.out.println("tag attributes:");
//             String[] attributes = tagAttributeData.get(key);
//             for(String attr:attributes){
//                 System.out.println(attr+":"+DOCUMENTATION.get(attr));
//             }
//              
//        }
//    }

    

    

    public static String[] getVueAttributes(String tag) {
        if(TAG_DATA.containsKey(tag)){
            return TAG_DATA.get(tag);
        }else{
            return new String[]{};
        }
    }
 
    public static Set<String> getVueTags() {
        
        return TAG_DATA.keySet();
    }

    /**
     * Returns description for given Thymeleaf attribute.
     *
     * @param attribute for which we need documentation
     * @return String containing documentation description
     */
    public static String getDoc(String attribute) {
        if(attribute.startsWith(":") || attribute.startsWith("@")){
            return DOCUMENTATION.get(attribute.substring(1));
        }
        return DOCUMENTATION.get(attribute);
    }
    
    public static Set<String> getDocKeys(){
        return DOCUMENTATION.keySet();
    }

}
