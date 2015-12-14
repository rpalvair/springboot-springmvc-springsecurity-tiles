
        <form style="margin-top:5%" class="form-horizontal" name='loginForm' action="${pageContext.request.contextPath}/login" method='POST'>

        <div class="form-group">
            <label for="username" class="col-md-2 col-md-offset-3 control-label">User</label>
            <div class="col-md-3">
              <input type="text" class="form-control" id="username" name="username">
            </div>
          </div>
          <div class="form-group" >
            <label for="password" class="col-md-offset-3 col-md-2 control-label">Password</label>
            <div class="col-md-3">
                <input type="password" class="form-control" id="password" name="password"></input>
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-offset-5 col-md-2">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
          </div>
        </form>